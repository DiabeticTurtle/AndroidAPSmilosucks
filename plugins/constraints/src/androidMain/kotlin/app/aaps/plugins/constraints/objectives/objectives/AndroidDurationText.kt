package app.aaps.plugins.constraints.objectives.objectives

import app.aaps.core.data.time.T
import app.aaps.core.interfaces.resources.ResourceHelper
import dev.zacsweers.metro.AppScope
import dev.zacsweers.metro.ContributesBinding
import dev.zacsweers.metro.Inject
import dev.zacsweers.metro.SingleIn
import kotlin.math.floor

/**
 * [DurationText] through Android's plural resources, which is what this said before the objectives
 * moved to shared code.
 *
 * Unchanged wording and unchanged translations: `R.plurals.days` and friends already carry the forms
 * every supported language needs, which is exactly why this could not be flattened into the shared
 * implementation.
 */
@SingleIn(AppScope::class)
@ContributesBinding(AppScope::class)
@Inject
class AndroidDurationText(
    private val rh: ResourceHelper
) : DurationText {

    override fun format(durationMs: Long): String {
        val days = floor(durationMs.toDouble() / T.days(0).msecs()).toInt()
        val hours = floor(durationMs.toDouble() / T.hours(0).msecs()).toInt()
        val minutes = floor(durationMs.toDouble() / T.mins(1).msecs()).toInt()
        return 
    }
}
