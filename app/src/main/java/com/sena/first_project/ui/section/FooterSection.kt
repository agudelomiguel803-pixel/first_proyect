package com.sena.first_project.ui.section

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.sena.first_project.ui.composable.InfoBox
import com.sena.first_project.ui.theme.Dimens

/**
 * Caja inferior. Recibe un slot (content) para agregar botones, textos, etc.
 * más adelante sin modificar este archivo.
 */
@Composable
fun FooterSection(
    modifier: Modifier = Modifier,
    content: @Composable RowScope.() -> Unit = {}
) {
    InfoBox(
        modifier = modifier
            .fillMaxWidth()
            .height(Dimens.SectionHeight)
    ) {
        Row(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.Red)
                .padding(horizontal = 16.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically,
            content = content
        )
    }
}

