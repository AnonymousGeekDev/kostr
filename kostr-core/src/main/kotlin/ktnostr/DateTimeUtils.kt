package ktnostr

import java.time.Instant
import java.time.ZoneId
import java.time.format.DateTimeFormatter

/**
* The function takes a Unix timestamp in and returns
* a human-readable date and time.
* @param timestamp - The Unix timestamp
* @return A human-readable date and time, as a string.
 */

fun formattedDateTime(timestamp: Long): String {
    return Instant.ofEpochSecond(timestamp).atZone(ZoneId.systemDefault())
        .format(DateTimeFormatter.ofPattern("uuuu MMM d hh:mm a"))
}

/**
 * The functions below return the current Unix timestamp.
 * They are technically equivalent.
 * Could there be hidden differences?
 */

fun currentUnixTimeStampFromInstant(): Long  = Instant.now().epochSecond
fun currentSystemUnixTimeStamp(): Long = System.currentTimeMillis().div(1000L)