/*
 * Copyright 2024 Joel Kanyi.

 * SPDX-License-Identifier: Apache-2.0
 */

package io.github.joelkanyi.designsystem.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import io.github.joelkanyi.designsystem.R

@Composable
fun ErrorStateComponent(
    modifier: Modifier = Modifier,
    message: String = stringResource(R.string.an_error_occurred_please_try_again_later)
) {
    Column(
        modifier = modifier.testTag(stringResource(R.string.error_state_component)),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        Text(
            text = message,
            style = MaterialTheme.typography.bodyMedium,
            textAlign = TextAlign.Center
        )
    }
}
