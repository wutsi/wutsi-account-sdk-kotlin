package com.wutsi.platform.account.dto

import java.time.OffsetDateTime
import kotlin.Boolean
import kotlin.Long
import kotlin.String

public data class Account(
  public val id: Long = 0,
  public val phone: Phone? = null,
  public val pictureUrl: String? = null,
  public val status: String = "",
  public val displayName: String? = null,
  public val language: String = "",
  public val country: String = "",
  public val created: OffsetDateTime = OffsetDateTime.now(),
  public val updated: OffsetDateTime = OffsetDateTime.now(),
  public val superUser: Boolean = false
)
