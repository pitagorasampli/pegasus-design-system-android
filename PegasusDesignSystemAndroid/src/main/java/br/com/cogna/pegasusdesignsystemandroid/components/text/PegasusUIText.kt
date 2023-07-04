package br.com.cogna.pegasusdesignsystemandroid.components.text

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.LocalTextStyle
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.TextLayoutResult
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.TextUnit
import br.com.cogna.pegasusdesignsystemandroid.brands.saraiva.theme.SaraivaPreviews
import br.com.cogna.pegasusdesignsystemandroid.brands.saraiva.theme.SaraivaTheme
import br.com.cogna.pegasusdesignsystemandroid.brands.sofia.theme.SofiaPreviews
import br.com.cogna.pegasusdesignsystemandroid.brands.sofia.theme.SofiaTheme
import br.com.cogna.pegasusdesignsystemandroid.components.theme.PegasusThemeProvider

@Composable
fun PegasusUIText(
    text: String,
    modifier: Modifier = Modifier,
    color: Color = Color.Unspecified,
    fontStyle: FontStyle? = null,
    fontWeight: FontWeight? = null,
    fontFamily: FontFamily? = null,
    textDecoration: TextDecoration? = null,
    textAlign: TextAlign? = null,
    overflow: TextOverflow = TextOverflow.Clip,
    softWrap: Boolean = true,
    maxLines: Int = Int.MAX_VALUE,
    minLines: Int = 1,
    onTextLayout: (TextLayoutResult) -> Unit = {},
    textStyle: TextStyle
) {
    Text(
        text = text,
        modifier = modifier,
        color = color,
        fontSize = TextUnit.Unspecified,
        fontStyle = fontStyle,
        fontWeight = fontWeight,
        fontFamily = fontFamily,
        letterSpacing =  TextUnit.Unspecified,
        textDecoration = textDecoration,
        textAlign = textAlign,
        lineHeight = TextUnit.Unspecified,
        overflow = overflow,
        softWrap = softWrap,
        maxLines = maxLines,
        minLines = minLines,
        onTextLayout = onTextLayout,
        style = textStyle
    )
}


@Composable
fun PegasusUIText(
    text: AnnotatedString,
    modifier: Modifier = Modifier,
    color: Color = Color.Unspecified,
    fontStyle: FontStyle? = null,
    fontWeight: FontWeight? = null,
    fontFamily: FontFamily? = null,
    textDecoration: TextDecoration? = null,
    textAlign: TextAlign? = null,
    overflow: TextOverflow = TextOverflow.Clip,
    softWrap: Boolean = true,
    maxLines: Int = Int.MAX_VALUE,
    minLines: Int = 1,
    onTextLayout: (TextLayoutResult) -> Unit = {},
    textStyle: TextStyle
) {
    Text(
        text = text,
        modifier = modifier,
        color = color,
        fontSize = TextUnit.Unspecified,
        fontStyle = fontStyle,
        fontWeight = fontWeight,
        fontFamily = fontFamily,
        letterSpacing =  TextUnit.Unspecified,
        textDecoration = textDecoration,
        textAlign = textAlign,
        lineHeight = TextUnit.Unspecified,
        overflow = overflow,
        softWrap = softWrap,
        maxLines = maxLines,
        minLines = minLines,
        onTextLayout = onTextLayout,
        style = textStyle
    )
}

@Composable
fun PegasusTypographyPreview() {
    Column(
        Modifier
            .background(color = PegasusThemeProvider.colorScheme.background)
    ) {

        Column(modifier = Modifier.padding(PegasusThemeProvider.spacing.spacing6)) {
            PegasusUIText(
                text = "displayLarge",
                textStyle = MaterialTheme.typography.displayLarge.copy()
            )

            Spacer(modifier = Modifier.height(PegasusThemeProvider.spacing.spacing6))

            PegasusUIText(
                text = "displayMedium",
                textStyle = MaterialTheme.typography.displayMedium
            )
            Spacer(modifier = Modifier.height(PegasusThemeProvider.spacing.spacing6))

            PegasusUIText(
                text = "displaySmall",
                textStyle = MaterialTheme.typography.displaySmall
            )
            Spacer(modifier = Modifier.height(PegasusThemeProvider.spacing.spacing6))

            PegasusUIText(
                text = "headlineLarge",
                textStyle = MaterialTheme.typography.headlineLarge
            )
            Spacer(modifier = Modifier.height(PegasusThemeProvider.spacing.spacing6))

            PegasusUIText(
                text = "headlineMedium",
                textStyle = MaterialTheme.typography.headlineMedium
            )
            Spacer(modifier = Modifier.height(PegasusThemeProvider.spacing.spacing6))

            PegasusUIText(
                text = "headlineSmall",
                textStyle = MaterialTheme.typography.headlineSmall
            )
            Spacer(modifier = Modifier.height(PegasusThemeProvider.spacing.spacing6))

            PegasusUIText(text = "titleLarge", textStyle = MaterialTheme.typography.titleLarge)

            Spacer(modifier = Modifier.height(PegasusThemeProvider.spacing.spacing6))

            PegasusUIText(
                text = "titleMedium",
                textStyle = MaterialTheme.typography.titleMedium
            )

            Spacer(modifier = Modifier.height(PegasusThemeProvider.spacing.spacing6))

            PegasusUIText(text = "titleSmall", textStyle = MaterialTheme.typography.titleSmall)
            Spacer(modifier = Modifier.height(PegasusThemeProvider.spacing.spacing6))

            PegasusUIText(text = "bodyLarge", textStyle = MaterialTheme.typography.bodyLarge)
            Spacer(modifier = Modifier.height(PegasusThemeProvider.spacing.spacing6))

            PegasusUIText(text = "bodyMedium", textStyle = MaterialTheme.typography.bodyMedium)
            Spacer(modifier = Modifier.height(PegasusThemeProvider.spacing.spacing6))

            PegasusUIText(text = "labelSmall", textStyle = MaterialTheme.typography.labelSmall)
        }


    }
}



@SofiaPreviews
@Composable
fun PegasusUIText_Sofia_Preview() {
    SofiaTheme {
        PegasusTypographyPreview()
    }
}


@SaraivaPreviews
@Composable
fun PegasusUIText_Saraiva_Preview() {
    SaraivaTheme {
        Column(
            Modifier
                .verticalScroll(rememberScrollState())
                .background(color = PegasusThemeProvider.colorScheme.background)
        ) {

            Column(modifier = Modifier.padding(PegasusThemeProvider.spacing.spacing6)) {
                PegasusUIText(
                    text = "displayLarge",
                    textStyle = MaterialTheme.typography.displayLarge.copy()
                )

                Spacer(modifier = Modifier.height(PegasusThemeProvider.spacing.spacing6))

                PegasusUIText(
                    text = "displayMedium",
                    textStyle = MaterialTheme.typography.displayMedium
                )
                Spacer(modifier = Modifier.height(PegasusThemeProvider.spacing.spacing6))

                PegasusUIText(
                    text = "displaySmall",
                    textStyle = MaterialTheme.typography.displaySmall
                )
                Spacer(modifier = Modifier.height(PegasusThemeProvider.spacing.spacing6))

                PegasusUIText(
                    text = "headlineLarge",
                    textStyle = MaterialTheme.typography.headlineLarge
                )
                Spacer(modifier = Modifier.height(PegasusThemeProvider.spacing.spacing6))

                PegasusUIText(
                    text = "headlineMedium",
                    textStyle = MaterialTheme.typography.headlineMedium
                )
                Spacer(modifier = Modifier.height(PegasusThemeProvider.spacing.spacing6))

                PegasusUIText(
                    text = "headlineSmall",
                    textStyle = MaterialTheme.typography.headlineSmall
                )
                Spacer(modifier = Modifier.height(PegasusThemeProvider.spacing.spacing6))

                PegasusUIText(text = "titleLarge", textStyle = MaterialTheme.typography.titleLarge)

                Spacer(modifier = Modifier.height(PegasusThemeProvider.spacing.spacing6))

                PegasusUIText(
                    text = "titleMedium",
                    textStyle = MaterialTheme.typography.titleMedium
                )

                Spacer(modifier = Modifier.height(PegasusThemeProvider.spacing.spacing6))

                PegasusUIText(text = "titleSmall", textStyle = MaterialTheme.typography.titleSmall)
                Spacer(modifier = Modifier.height(PegasusThemeProvider.spacing.spacing6))

                PegasusUIText(text = "bodyLarge", textStyle = MaterialTheme.typography.bodyLarge)
                Spacer(modifier = Modifier.height(PegasusThemeProvider.spacing.spacing6))

                PegasusUIText(text = "bodyMedium", textStyle = MaterialTheme.typography.bodyMedium)
                Spacer(modifier = Modifier.height(PegasusThemeProvider.spacing.spacing6))

                PegasusUIText(text = "labelSmall", textStyle = MaterialTheme.typography.labelSmall)

            }


        }
    }
}