package com.meergo.analytics.http;

import com.google.auto.value.AutoValue;
import com.meergo.analytics.gson.AutoGson;

@AutoValue
@AutoGson
public abstract class UploadResponse {
  public abstract boolean success();
}
