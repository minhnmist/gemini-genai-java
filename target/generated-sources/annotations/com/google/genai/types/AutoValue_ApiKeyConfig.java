package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_ApiKeyConfig extends ApiKeyConfig {

  private final Optional<String> apiKeySecret;

  private final Optional<String> apiKeyString;

  private final Optional<HttpElementLocation> httpElementLocation;

  private final Optional<String> name;

  private AutoValue_ApiKeyConfig(
      Optional<String> apiKeySecret,
      Optional<String> apiKeyString,
      Optional<HttpElementLocation> httpElementLocation,
      Optional<String> name) {
    this.apiKeySecret = apiKeySecret;
    this.apiKeyString = apiKeyString;
    this.httpElementLocation = httpElementLocation;
    this.name = name;
  }

  @JsonProperty("apiKeySecret")
  @Override
  public Optional<String> apiKeySecret() {
    return apiKeySecret;
  }

  @JsonProperty("apiKeyString")
  @Override
  public Optional<String> apiKeyString() {
    return apiKeyString;
  }

  @JsonProperty("httpElementLocation")
  @Override
  public Optional<HttpElementLocation> httpElementLocation() {
    return httpElementLocation;
  }

  @JsonProperty("name")
  @Override
  public Optional<String> name() {
    return name;
  }

  @Override
  public String toString() {
    return "ApiKeyConfig{"
        + "apiKeySecret=" + apiKeySecret + ", "
        + "apiKeyString=" + apiKeyString + ", "
        + "httpElementLocation=" + httpElementLocation + ", "
        + "name=" + name
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof ApiKeyConfig) {
      ApiKeyConfig that = (ApiKeyConfig) o;
      return this.apiKeySecret.equals(that.apiKeySecret())
          && this.apiKeyString.equals(that.apiKeyString())
          && this.httpElementLocation.equals(that.httpElementLocation())
          && this.name.equals(that.name());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= apiKeySecret.hashCode();
    h$ *= 1000003;
    h$ ^= apiKeyString.hashCode();
    h$ *= 1000003;
    h$ ^= httpElementLocation.hashCode();
    h$ *= 1000003;
    h$ ^= name.hashCode();
    return h$;
  }

  @Override
  public ApiKeyConfig.Builder toBuilder() {
    return new AutoValue_ApiKeyConfig.Builder(this);
  }

  static final class Builder extends ApiKeyConfig.Builder {
    private Optional<String> apiKeySecret = Optional.empty();
    private Optional<String> apiKeyString = Optional.empty();
    private Optional<HttpElementLocation> httpElementLocation = Optional.empty();
    private Optional<String> name = Optional.empty();
    Builder() {
    }
    Builder(ApiKeyConfig source) {
      this.apiKeySecret = source.apiKeySecret();
      this.apiKeyString = source.apiKeyString();
      this.httpElementLocation = source.httpElementLocation();
      this.name = source.name();
    }
    @Override
    public ApiKeyConfig.Builder apiKeySecret(String apiKeySecret) {
      this.apiKeySecret = Optional.of(apiKeySecret);
      return this;
    }
    @Override
    ApiKeyConfig.Builder apiKeySecret(Optional<String> apiKeySecret) {
      if (apiKeySecret == null) {
        throw new NullPointerException("Null apiKeySecret");
      }
      this.apiKeySecret = apiKeySecret;
      return this;
    }
    @Override
    public ApiKeyConfig.Builder apiKeyString(String apiKeyString) {
      this.apiKeyString = Optional.of(apiKeyString);
      return this;
    }
    @Override
    ApiKeyConfig.Builder apiKeyString(Optional<String> apiKeyString) {
      if (apiKeyString == null) {
        throw new NullPointerException("Null apiKeyString");
      }
      this.apiKeyString = apiKeyString;
      return this;
    }
    @Override
    public ApiKeyConfig.Builder httpElementLocation(HttpElementLocation httpElementLocation) {
      this.httpElementLocation = Optional.of(httpElementLocation);
      return this;
    }
    @Override
    ApiKeyConfig.Builder httpElementLocation(Optional<HttpElementLocation> httpElementLocation) {
      if (httpElementLocation == null) {
        throw new NullPointerException("Null httpElementLocation");
      }
      this.httpElementLocation = httpElementLocation;
      return this;
    }
    @Override
    public ApiKeyConfig.Builder name(String name) {
      this.name = Optional.of(name);
      return this;
    }
    @Override
    ApiKeyConfig.Builder name(Optional<String> name) {
      if (name == null) {
        throw new NullPointerException("Null name");
      }
      this.name = name;
      return this;
    }
    @Override
    public ApiKeyConfig build() {
      return new AutoValue_ApiKeyConfig(
          this.apiKeySecret,
          this.apiKeyString,
          this.httpElementLocation,
          this.name);
    }
  }

}
