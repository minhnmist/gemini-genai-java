package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_ApiAuthApiKeyConfig extends ApiAuthApiKeyConfig {

  private final Optional<String> apiKeySecretVersion;

  private final Optional<String> apiKeyString;

  private AutoValue_ApiAuthApiKeyConfig(
      Optional<String> apiKeySecretVersion,
      Optional<String> apiKeyString) {
    this.apiKeySecretVersion = apiKeySecretVersion;
    this.apiKeyString = apiKeyString;
  }

  @JsonProperty("apiKeySecretVersion")
  @Override
  public Optional<String> apiKeySecretVersion() {
    return apiKeySecretVersion;
  }

  @JsonProperty("apiKeyString")
  @Override
  public Optional<String> apiKeyString() {
    return apiKeyString;
  }

  @Override
  public String toString() {
    return "ApiAuthApiKeyConfig{"
        + "apiKeySecretVersion=" + apiKeySecretVersion + ", "
        + "apiKeyString=" + apiKeyString
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof ApiAuthApiKeyConfig) {
      ApiAuthApiKeyConfig that = (ApiAuthApiKeyConfig) o;
      return this.apiKeySecretVersion.equals(that.apiKeySecretVersion())
          && this.apiKeyString.equals(that.apiKeyString());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= apiKeySecretVersion.hashCode();
    h$ *= 1000003;
    h$ ^= apiKeyString.hashCode();
    return h$;
  }

  @Override
  public ApiAuthApiKeyConfig.Builder toBuilder() {
    return new AutoValue_ApiAuthApiKeyConfig.Builder(this);
  }

  static final class Builder extends ApiAuthApiKeyConfig.Builder {
    private Optional<String> apiKeySecretVersion = Optional.empty();
    private Optional<String> apiKeyString = Optional.empty();
    Builder() {
    }
    Builder(ApiAuthApiKeyConfig source) {
      this.apiKeySecretVersion = source.apiKeySecretVersion();
      this.apiKeyString = source.apiKeyString();
    }
    @Override
    public ApiAuthApiKeyConfig.Builder apiKeySecretVersion(String apiKeySecretVersion) {
      this.apiKeySecretVersion = Optional.of(apiKeySecretVersion);
      return this;
    }
    @Override
    ApiAuthApiKeyConfig.Builder apiKeySecretVersion(Optional<String> apiKeySecretVersion) {
      if (apiKeySecretVersion == null) {
        throw new NullPointerException("Null apiKeySecretVersion");
      }
      this.apiKeySecretVersion = apiKeySecretVersion;
      return this;
    }
    @Override
    public ApiAuthApiKeyConfig.Builder apiKeyString(String apiKeyString) {
      this.apiKeyString = Optional.of(apiKeyString);
      return this;
    }
    @Override
    ApiAuthApiKeyConfig.Builder apiKeyString(Optional<String> apiKeyString) {
      if (apiKeyString == null) {
        throw new NullPointerException("Null apiKeyString");
      }
      this.apiKeyString = apiKeyString;
      return this;
    }
    @Override
    public ApiAuthApiKeyConfig build() {
      return new AutoValue_ApiAuthApiKeyConfig(
          this.apiKeySecretVersion,
          this.apiKeyString);
    }
  }

}
