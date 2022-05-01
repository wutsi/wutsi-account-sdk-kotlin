package com.wutsi.platform.account.dto

import java.time.OffsetDateTime
import kotlin.Boolean
import kotlin.Long
import kotlin.String

public data class Account(
  public val id: Long = 0,
  public val email: String? = null,
  public val phone: Phone? = null,
  public val pictureUrl: String? = null,
  public val status: String = "",
  public val displayName: String? = null,
  public val language: String = "",
  public val country: String = "",
  public val created: OffsetDateTime = OffsetDateTime.now(),
  public val updated: OffsetDateTime = OffsetDateTime.now(),
  public val superUser: Boolean = false,
  public val transferSecured: Boolean = true,
  public val business: Boolean = false,
  public val retail: Boolean = false,
  public val biography: String? = null,
  public val website: String? = null,
  public val whatsapp: String? = null,
  public val street: String? = null,
  public val cityId: Long? = null,
  public val timezoneId: String? = null,
  public val category: Category? = null,
  public val hasStore: Boolean = false
)
