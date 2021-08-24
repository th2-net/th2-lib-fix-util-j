/******************************************************************************
 * Copyright 2021-2021 Exactpro (Exactpro Systems Limited)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.exactpro.th2.lib.fix

import com.exactpro.th2.lib.fix.util.DateTimeUtility
import java.time.LocalDateTime
import kotlin.random.Random

class FixUtil {

    private var nextID = 1;
    fun generateClOrdID(): String {
        return (System.currentTimeMillis() + nextID++).toString();
    }

    @JvmOverloads
    fun generateTransactTime(dateTime: String = ""): LocalDateTime {
        return DateUtil.modifyLocalDateTime(dateTime);
    }

    companion object {
        @JvmStatic
        fun generateHexString(): String {
            return java.lang.Long.toHexString(java.lang.Double.doubleToLongBits(Math.random()))
        }

        @JvmStatic
        fun generateInteger(bound: Int): Int {
            return Random.nextInt(bound);
        }
    }
}
