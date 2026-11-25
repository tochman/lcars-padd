package com.tochman.lcarspadd.ui

import androidx.compose.ui.test.assertExists
import androidx.compose.ui.test.assertTextEquals
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithTag
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performClick
import org.junit.Rule
import org.junit.Test

class PaddHomeScreenTest {
    @get:Rule
    val composeRule = createComposeRule()

    @Test
    fun navigationShowsExplicitPreviewContent() {
        composeRule.setContent {
            PaddHomeScreen()
        }

        composeRule.onNodeWithTag("module-title").assertTextEquals("PADD INTERFACE")
        composeRule.onNodeWithTag("nav-science").performClick()
        composeRule.onNodeWithTag("module-title").assertTextEquals("SCIENCE MODULE")
        composeRule.onNodeWithText("No device, sensor, or network data is being read.").assertExists()
    }
}
