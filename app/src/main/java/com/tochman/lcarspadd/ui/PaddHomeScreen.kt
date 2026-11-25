package com.tochman.lcarspadd.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeDrawing
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.windowInsetsPadding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.selection.selectableGroup
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.semantics.role
import androidx.compose.ui.semantics.selected
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.platform.testTag

private object LcarsColors {
    val background = Color(0xFF05060A)
    val slate2 = Color(0xFF2B3145)
    val slate3 = Color(0xFF4A5370)
    val slate4 = Color(0xFF6F7894)
    val slate5 = Color(0xFF9AA2BB)
    val steelDeep = Color(0xFF1F3B57)
    val steel = Color(0xFF4FA3D9)
    val steelText = Color(0xFF7CC0EA)
    val text = Color(0xFFE6E9F2)
    val text2 = Color(0xFFC3C9D8)
    val muted = Color(0xFF9AA3B8)
    val onLight = Color(0xFF000000)
}

private enum class PaddSection(val label: String, val heading: String, val description: String) {
    Overview(
        label = "OVERVIEW",
        heading = "PADD INTERFACE",
        description = "The home surface is ready for its first modules.",
    ),
    Science(
        label = "SCIENCE",
        heading = "SCIENCE MODULE",
        description = "A native science readout will be added here.",
    ),
    Communications(
        label = "COMMS",
        heading = "COMMUNICATIONS MODULE",
        description = "A native communications surface will be added here.",
    ),
}

@Composable
fun PaddHomeScreen() {
    var selectedSection by rememberSaveable { mutableStateOf(PaddSection.Overview) }

    BoxWithConstraints(
        modifier = Modifier
            .fillMaxSize()
            .background(LcarsColors.background)
            .windowInsetsPadding(WindowInsets.safeDrawing)
            .padding(horizontal = 16.dp, vertical = 12.dp),
    ) {
        val wideLayout = maxWidth >= 700.dp

        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.spacedBy(14.dp),
        ) {
            PaddHeader(compact = maxWidth < 480.dp)

            if (wideLayout) {
                Row(
                    modifier = Modifier.weight(1f),
                    horizontalArrangement = Arrangement.spacedBy(18.dp),
                ) {
                    Navigation(
                        selected = selectedSection,
                        onSelect = { selectedSection = it },
                        wide = true,
                        modifier = Modifier
                            .width(164.dp)
                            .fillMaxHeight(),
                    )
                    MainFrame(
                        section = selectedSection,
                        modifier = Modifier.weight(1f),
                    )
                }
            } else {
                Column(
                    modifier = Modifier
                        .weight(1f)
                        .verticalScroll(rememberScrollState()),
                    verticalArrangement = Arrangement.spacedBy(14.dp),
                ) {
                    Navigation(
                        selected = selectedSection,
                        onSelect = { selectedSection = it },
                        wide = false,
                        modifier = Modifier.fillMaxWidth(),
                    )
                    MainFrame(
                        section = selectedSection,
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(380.dp),
                    )
                }
            }

            PaddFooter()
        }
    }
}

@Composable
private fun PaddHeader(compact: Boolean) {
    Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            Text(
                text = "LCARS PADD",
                color = LcarsColors.steelText,
                fontSize = 13.sp,
                fontWeight = FontWeight.SemiBold,
                letterSpacing = 2.sp,
            )
            Spacer(Modifier.weight(1f))
            Text(
                text = "APPLICATION PREVIEW",
                color = LcarsColors.muted,
                fontSize = 11.sp,
                letterSpacing = 1.2.sp,
            )
        }
        if (compact) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
            ) {
                Text(
                    text = "SYSTEM CONSOLE",
                    modifier = Modifier.weight(1f),
                    color = LcarsColors.steel,
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold,
                    letterSpacing = 1.sp,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis,
                )
                Text(
                    text = "LOCAL / PREVIEW",
                    modifier = Modifier
                        .clip(RoundedCornerShape(topStart = 14.dp, bottomEnd = 14.dp))
                        .background(LcarsColors.slate2)
                        .padding(horizontal = 8.dp, vertical = 7.dp),
                    color = LcarsColors.text2,
                    fontSize = 9.sp,
                    fontWeight = FontWeight.SemiBold,
                    letterSpacing = 0.5.sp,
                    maxLines = 1,
                )
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(8.dp),
                horizontalArrangement = Arrangement.spacedBy(6.dp),
            ) {
                Box(Modifier.weight(3f).fillMaxHeight().background(LcarsColors.slate4))
                Box(Modifier.weight(1f).fillMaxHeight().background(LcarsColors.steelDeep))
            }
        } else {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(42.dp),
                horizontalArrangement = Arrangement.spacedBy(6.dp),
                verticalAlignment = Alignment.CenterVertically,
            ) {
                Text(
                    text = "SYSTEM CONSOLE",
                    modifier = Modifier.padding(end = 4.dp),
                    color = LcarsColors.steel,
                    fontSize = 22.sp,
                    fontWeight = FontWeight.Bold,
                    letterSpacing = 1.5.sp,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis,
                )
                Box(
                    Modifier
                        .weight(1f)
                        .height(30.dp)
                        .background(LcarsColors.slate4),
                )
                Box(
                    Modifier
                        .width(40.dp)
                        .height(30.dp)
                        .background(LcarsColors.steelDeep),
                )
                Text(
                    text = "LOCAL / PREVIEW",
                    modifier = Modifier
                        .clip(RoundedCornerShape(topStart = 14.dp, bottomEnd = 14.dp))
                        .background(LcarsColors.slate2)
                        .padding(horizontal = 10.dp, vertical = 8.dp),
                    color = LcarsColors.text2,
                    fontSize = 10.sp,
                    fontWeight = FontWeight.SemiBold,
                    letterSpacing = 0.8.sp,
                    maxLines = 1,
                )
            }
        }
    }
}

@Composable
private fun Navigation(
    selected: PaddSection,
    onSelect: (PaddSection) -> Unit,
    wide: Boolean,
    modifier: Modifier = Modifier,
) {
    val sections = PaddSection.entries
    if (wide) {
        Column(
            modifier = modifier.selectableGroup(),
            verticalArrangement = Arrangement.spacedBy(10.dp),
        ) {
            sections.forEach { section ->
                NavigationButton(
                    section = section,
                    selected = selected == section,
                    onClick = { onSelect(section) },
                    modifier = Modifier.fillMaxWidth(),
                )
            }
            Spacer(Modifier.weight(1f))
            Text(
                text = "MODULES",
                color = LcarsColors.muted,
                fontSize = 10.sp,
                letterSpacing = 1.5.sp,
                modifier = Modifier.padding(start = 4.dp),
            )
        }
    } else {
        Row(
            modifier = modifier
                .horizontalScroll(rememberScrollState())
                .selectableGroup(),
            horizontalArrangement = Arrangement.spacedBy(8.dp),
        ) {
            sections.forEach { section ->
                NavigationButton(
                    section = section,
                    selected = selected == section,
                    onClick = { onSelect(section) },
                    modifier = Modifier.width(132.dp),
                )
            }
        }
    }
}

@Composable
private fun NavigationButton(
    section: PaddSection,
    selected: Boolean,
    onClick: () -> Unit,
    modifier: Modifier,
) {
    Button(
        onClick = onClick,
        modifier = modifier
            .height(54.dp)
            .semantics {
                role = Role.Tab
                this.selected = selected
            }
            .testTag("nav-${section.name.lowercase()}"),
        shape = RoundedCornerShape(0.dp),
        contentPadding = PaddingValues(horizontal = 10.dp, vertical = 6.dp),
        colors = ButtonDefaults.buttonColors(
            containerColor = if (selected) LcarsColors.slate5 else LcarsColors.slate2,
            contentColor = if (selected) LcarsColors.onLight else LcarsColors.text2,
        ),
    ) {
        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.BottomEnd,
        ) {
            Text(
                text = section.label,
                fontFamily = FontFamily.SansSerif,
                fontWeight = if (selected) FontWeight.Bold else FontWeight.Medium,
                fontSize = 13.sp,
                letterSpacing = 1.sp,
                textAlign = TextAlign.End,
            )
        }
    }
}

@Composable
private fun MainFrame(
    section: PaddSection,
    modifier: Modifier = Modifier,
) {
    Column(
        modifier = modifier
            .border(
                width = 2.dp,
                color = LcarsColors.slate3,
                shape = RoundedCornerShape(topStart = 32.dp),
            )
            .padding(start = 18.dp, top = 16.dp, end = 16.dp, bottom = 16.dp),
        verticalArrangement = Arrangement.spacedBy(18.dp),
    ) {
        SegmentedTitle(section.heading)

        Column(
            modifier = Modifier
                .weight(1f)
                .verticalScroll(rememberScrollState()),
            verticalArrangement = Arrangement.spacedBy(18.dp),
        ) {
            Text(
                text = section.label,
                color = LcarsColors.muted,
                fontSize = 11.sp,
                letterSpacing = 1.8.sp,
            )
            Text(
                text = section.heading,
                modifier = Modifier.testTag("module-title"),
                color = LcarsColors.steelText,
                fontSize = 26.sp,
                fontWeight = FontWeight.SemiBold,
                letterSpacing = 1.4.sp,
            )
            Text(
                text = section.description,
                color = LcarsColors.text,
                fontSize = 16.sp,
                lineHeight = 24.sp,
            )
            HorizontalRule()
            Text(
                text = "PREVIEW ONLY",
                color = LcarsColors.steelText,
                fontSize = 12.sp,
                fontWeight = FontWeight.SemiBold,
                letterSpacing = 1.4.sp,
            )
            Text(
                text = "No device, sensor, or network data is being read.",
                color = LcarsColors.text2,
                fontSize = 14.sp,
                lineHeight = 21.sp,
            )
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(6.dp),
            ) {
                repeat(6) { index ->
                    Box(
                        Modifier
                            .weight(if (index == 0) 2f else 1f)
                            .height(12.dp)
                            .background(
                                when (index) {
                                    0 -> LcarsColors.steel
                                    1 -> LcarsColors.slate4
                                    else -> LcarsColors.slate2
                                },
                            ),
                    )
                }
            }
        }

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(6.dp),
        ) {
            Box(
                Modifier
                    .weight(1f)
                    .height(12.dp)
                    .background(LcarsColors.slate2),
            )
            Box(
                Modifier
                    .width(48.dp)
                    .height(12.dp)
                    .background(LcarsColors.steelDeep),
            )
        }
    }
}

@Composable
private fun SegmentedTitle(title: String) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(36.dp),
        horizontalArrangement = Arrangement.spacedBy(6.dp),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Text(
            text = title,
            color = LcarsColors.steel,
            fontSize = 16.sp,
            fontWeight = FontWeight.Bold,
            letterSpacing = 0.8.sp,
            maxLines = 1,
            overflow = TextOverflow.Ellipsis,
        )
        Box(
            Modifier
                .weight(1f)
                .height(24.dp)
                .background(LcarsColors.slate4),
        )
        Box(
            Modifier
                .width(32.dp)
                .height(24.dp)
                .background(LcarsColors.steelDeep),
        )
    }
}

@Composable
private fun HorizontalRule() {
    Box(
        Modifier
            .fillMaxWidth()
            .height(1.dp)
            .background(LcarsColors.slate2),
    )
}

@Composable
private fun PaddFooter() {
    Row(
        modifier = Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Text(
            text = "LOCAL PREVIEW",
            color = LcarsColors.muted,
            fontSize = 10.sp,
            letterSpacing = 1.2.sp,
        )
        Spacer(Modifier.weight(1f))
        Box(
            Modifier
                .width(8.dp)
                .height(8.dp)
                .background(LcarsColors.steel),
        )
        Spacer(Modifier.width(8.dp))
        Text(
            text = "INTERFACE ACTIVE",
            color = LcarsColors.steelText,
            fontSize = 10.sp,
            letterSpacing = 1.sp,
        )
    }
}
