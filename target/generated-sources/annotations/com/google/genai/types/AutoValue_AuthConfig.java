package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_AuthConfig extends AuthConfig {

  private final Optional<ApiKeyConfig> apiKeyConfig;

  private final Optional<AuthType> authType;

  private final Optional<AuthConfigGoogleServiceAccountConfig> googleServiceAccountConfig;

  private final Optional<AuthConfigHttpBasicAuthConfig> httpBasicAuthConfig;

  private final Optional<AuthConfigOauthConfig> oauthConfig;

  private final Optional<AuthConfigOidcConfig> oidcConfig;

  private AutoValue_AuthConfig(
      Optional<ApiKeyConfig> apiKeyConfig,
      Optional<AuthType> authType,
      Optional<AuthConfigGoogleServiceAccountConfig> googleServiceAccountConfig,
      Optional<AuthConfigHttpBasicAuthConfig> httpBasicAuthConfig,
      Optional<AuthConfigOauthConfig> oauthConfig,
      Optional<AuthConfigOidcConfig> oidcConfig) {
    this.apiKeyConfig = apiKeyConfig;
    this.authType = authType;
    this.googleServiceAccountConfig = googleServiceAccountConfig;
    this.httpBasicAuthConfig = httpBasicAuthConfig;
    this.oauthConfig = oauthConfig;
    this.oidcConfig = oidcConfig;
  }

  @JsonProperty("apiKeyConfig")
  @Override
  public Optional<ApiKeyConfig> apiKeyConfig() {
    return apiKeyConfig;
  }

  @JsonProperty("authType")
  @Override
  public Optional<AuthType> authType() {
    return authType;
  }

  @JsonProperty("googleServiceAccountConfig")
  @Override
  public Optional<AuthConfigGoogleServiceAccountConfig> googleServiceAccountConfig() {
    return googleServiceAccountConfig;
  }

  @JsonProperty("httpBasicAuthConfig")
  @Override
  public Optional<AuthConfigHttpBasicAuthConfig> httpBasicAuthConfig() {
    return httpBasicAuthConfig;
  }

  @JsonProperty("oauthConfig")
  @Override
  public Optional<AuthConfigOauthConfig> oauthConfig() {
    return oauthConfig;
  }

  @JsonProperty("oidcConfig")
  @Override
  public Optional<AuthConfigOidcConfig> oidcConfig() {
    return oidcConfig;
  }

  @Override
  public String toString() {
    return "AuthConfig{"
        + "apiKeyConfig=" + apiKeyConfig + ", "
        + "authType=" + authType + ", "
        + "googleServiceAccountConfig=" + googleServiceAccountConfig + ", "
        + "httpBasicAuthConfig=" + httpBasicAuthConfig + ", "
        + "oauthConfig=" + oauthConfig + ", "
        + "oidcConfig=" + oidcConfig
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof AuthConfig) {
      AuthConfig that = (AuthConfig) o;
      return this.apiKeyConfig.equals(that.apiKeyConfig())
          && this.authType.equals(that.authType())
          && this.googleServiceAccountConfig.equals(that.googleServiceAccountConfig())
          && this.httpBasicAuthConfig.equals(that.httpBasicAuthConfig())
          && this.oauthConfig.equals(that.oauthConfig())
          && this.oidcConfig.equals(that.oidcConfig());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= apiKeyConfig.hashCode();
    h$ *= 1000003;
    h$ ^= authType.hashCode();
    h$ *= 1000003;
    h$ ^= googleServiceAccountConfig.hashCode();
    h$ *= 1000003;
    h$ ^= httpBasicAuthConfig.hashCode();
    h$ *= 1000003;
    h$ ^= oauthConfig.hashCode();
    h$ *= 1000003;
    h$ ^= oidcConfig.hashCode();
    return h$;
  }

  @Override
  public AuthConfig.Builder toBuilder() {
    return new AutoValue_AuthConfig.Builder(this);
  }

  static final class Builder extends AuthConfig.Builder {
    private Optional<ApiKeyConfig> apiKeyConfig = Optional.empty();
    private Optional<AuthType> authType = Optional.empty();
    private Optional<AuthConfigGoogleServiceAccountConfig> googleServiceAccountConfig = Optional.empty();
    private Optional<AuthConfigHttpBasicAuthConfig> httpBasicAuthConfig = Optional.empty();
    private Optional<AuthConfigOauthConfig> oauthConfig = Optional.empty();
    private Optional<AuthConfigOidcConfig> oidcConfig = Optional.empty();
    Builder() {
    }
    Builder(AuthConfig source) {
      this.apiKeyConfig = source.apiKeyConfig();
      this.authType = source.authType();
      this.googleServiceAccountConfig = source.googleServiceAccountConfig();
      this.httpBasicAuthConfig = source.httpBasicAuthConfig();
      this.oauthConfig = source.oauthConfig();
      this.oidcConfig = source.oidcConfig();
    }
    @Override
    public AuthConfig.Builder apiKeyConfig(ApiKeyConfig apiKeyConfig) {
      this.apiKeyConfig = Optional.of(apiKeyConfig);
      return this;
    }
    @Override
    AuthConfig.Builder apiKeyConfig(Optional<ApiKeyConfig> apiKeyConfig) {
      if (apiKeyConfig == null) {
        throw new NullPointerException("Null apiKeyConfig");
      }
      this.apiKeyConfig = apiKeyConfig;
      return this;
    }
    @Override
    public AuthConfig.Builder authType(AuthType authType) {
      this.authType = Optional.of(authType);
      return this;
    }
    @Override
    AuthConfig.Builder authType(Optional<AuthType> authType) {
      if (authType == null) {
        throw new NullPointerException("Null authType");
      }
      this.authType = authType;
      return this;
    }
    @Override
    public AuthConfig.Builder googleServiceAccountConfig(AuthConfigGoogleServiceAccountConfig googleServiceAccountConfig) {
      this.googleServiceAccountConfig = Optional.of(googleServiceAccountConfig);
      return this;
    }
    @Override
    AuthConfig.Builder googleServiceAccountConfig(Optional<AuthConfigGoogleServiceAccountConfig> googleServiceAccountConfig) {
      if (googleServiceAccountConfig == null) {
        throw new NullPointerException("Null googleServiceAccountConfig");
      }
      this.googleServiceAccountConfig = googleServiceAccountConfig;
      return this;
    }
    @Override
    public AuthConfig.Builder httpBasicAuthConfig(AuthConfigHttpBasicAuthConfig httpBasicAuthConfig) {
      this.httpBasicAuthConfig = Optional.of(httpBasicAuthConfig);
      return this;
    }
    @Override
    AuthConfig.Builder httpBasicAuthConfig(Optional<AuthConfigHttpBasicAuthConfig> httpBasicAuthConfig) {
      if (httpBasicAuthConfig == null) {
        throw new NullPointerException("Null httpBasicAuthConfig");
      }
      this.httpBasicAuthConfig = httpBasicAuthConfig;
      return this;
    }
    @Override
    public AuthConfig.Builder oauthConfig(AuthConfigOauthConfig oauthConfig) {
      this.oauthConfig = Optional.of(oauthConfig);
      return this;
    }
    @Override
    AuthConfig.Builder oauthConfig(Optional<AuthConfigOauthConfig> oauthConfig) {
      if (oauthConfig == null) {
        throw new NullPointerException("Null oauthConfig");
      }
      this.oauthConfig = oauthConfig;
      return this;
    }
    @Override
    public AuthConfig.Builder oidcConfig(AuthConfigOidcConfig oidcConfig) {
      this.oidcConfig = Optional.of(oidcConfig);
      return this;
    }
    @Override
    AuthConfig.Builder oidcConfig(Optional<AuthConfigOidcConfig> oidcConfig) {
      if (oidcConfig == null) {
        throw new NullPointerException("Null oidcConfig");
      }
      this.oidcConfig = oidcConfig;
      return this;
    }
    @Override
    public AuthConfig build() {
      return new AutoValue_AuthConfig(
          this.apiKeyConfig,
          this.authType,
          this.googleServiceAccountConfig,
          this.httpBasicAuthConfig,
          this.oauthConfig,
          this.oidcConfig);
    }
  }

}
