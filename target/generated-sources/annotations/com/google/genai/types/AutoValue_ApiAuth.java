package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_ApiAuth extends ApiAuth {

  private final Optional<ApiAuthApiKeyConfig> apiKeyConfig;

  private AutoValue_ApiAuth(
      Optional<ApiAuthApiKeyConfig> apiKeyConfig) {
    this.apiKeyConfig = apiKeyConfig;
  }

  @JsonProperty("apiKeyConfig")
  @Override
  public Optional<ApiAuthApiKeyConfig> apiKeyConfig() {
    return apiKeyConfig;
  }

  @Override
  public String toString() {
    return "ApiAuth{"
        + "apiKeyConfig=" + apiKeyConfig
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof ApiAuth) {
      ApiAuth that = (ApiAuth) o;
      return this.apiKeyConfig.equals(that.apiKeyConfig());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= apiKeyConfig.hashCode();
    return h$;
  }

  @Override
  public ApiAuth.Builder toBuilder() {
    return new AutoValue_ApiAuth.Builder(this);
  }

  static final class Builder extends ApiAuth.Builder {
    private Optional<ApiAuthApiKeyConfig> apiKeyConfig = Optional.empty();
    Builder() {
    }
    Builder(ApiAuth source) {
      this.apiKeyConfig = source.apiKeyConfig();
    }
    @Override
    public ApiAuth.Builder apiKeyConfig(ApiAuthApiKeyConfig apiKeyConfig) {
      this.apiKeyConfig = Optional.of(apiKeyConfig);
      return this;
    }
    @Override
    ApiAuth.Builder apiKeyConfig(Optional<ApiAuthApiKeyConfig> apiKeyConfig) {
      if (apiKeyConfig == null) {
        throw new NullPointerException("Null apiKeyConfig");
      }
      this.apiKeyConfig = apiKeyConfig;
      return this;
    }
    @Override
    public ApiAuth build() {
      return new AutoValue_ApiAuth(
          this.apiKeyConfig);
    }
  }

}
