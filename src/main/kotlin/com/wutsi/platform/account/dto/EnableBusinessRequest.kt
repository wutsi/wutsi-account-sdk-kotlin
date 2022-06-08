package com.wutsi.platform.account.dto

import kotlin.Long
import kotlin.String

public data class EnableBusinessRequest(
  public val displayName: String = "",
  public val categoryId: Long? = null,
  public val country: String = "",
  public val cityId: Long? = null,
  public val street: String? = null,
  public val biography: String? = null,
  public val whatsapp: String? = null
)
