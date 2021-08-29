package com.wutsi.platform.account.dto

import java.time.OffsetDateTime
import kotlin.Long
import kotlin.String

public data class Account(
  public val id: Long = 0,
  public val phone: Phone = Phone(),
  public val pictureUrl: String? = null,
  public val status: String = "",
  public val displayName: String? = null,
  public val created: OffsetDateTime = OffsetDateTime.now(),
  public val updated: OffsetDateTime = OffsetDateTime.now()
)
