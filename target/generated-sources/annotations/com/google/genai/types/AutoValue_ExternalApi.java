package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_ExternalApi extends ExternalApi {

  private final Optional<ApiAuth> apiAuth;

  private final Optional<ApiSpec> apiSpec;

  private final Optional<AuthConfig> authConfig;

  private final Optional<ExternalApiElasticSearchParams> elasticSearchParams;

  private final Optional<String> endpoint;

  private final Optional<ExternalApiSimpleSearchParams> simpleSearchParams;

  private AutoValue_ExternalApi(
      Optional<ApiAuth> apiAuth,
      Optional<ApiSpec> apiSpec,
      Optional<AuthConfig> authConfig,
      Optional<ExternalApiElasticSearchParams> elasticSearchParams,
      Optional<String> endpoint,
      Optional<ExternalApiSimpleSearchParams> simpleSearchParams) {
    this.apiAuth = apiAuth;
    this.apiSpec = apiSpec;
    this.authConfig = authConfig;
    this.elasticSearchParams = elasticSearchParams;
    this.endpoint = endpoint;
    this.simpleSearchParams = simpleSearchParams;
  }

  @JsonProperty("apiAuth")
  @Override
  public Optional<ApiAuth> apiAuth() {
    return apiAuth;
  }

  @JsonProperty("apiSpec")
  @Override
  public Optional<ApiSpec> apiSpec() {
    return apiSpec;
  }

  @JsonProperty("authConfig")
  @Override
  public Optional<AuthConfig> authConfig() {
    return authConfig;
  }

  @JsonProperty("elasticSearchParams")
  @Override
  public Optional<ExternalApiElasticSearchParams> elasticSearchParams() {
    return elasticSearchParams;
  }

  @JsonProperty("endpoint")
  @Override
  public Optional<String> endpoint() {
    return endpoint;
  }

  @JsonProperty("simpleSearchParams")
  @Override
  public Optional<ExternalApiSimpleSearchParams> simpleSearchParams() {
    return simpleSearchParams;
  }

  @Override
  public String toString() {
    return "ExternalApi{"
        + "apiAuth=" + apiAuth + ", "
        + "apiSpec=" + apiSpec + ", "
        + "authConfig=" + authConfig + ", "
        + "elasticSearchParams=" + elasticSearchParams + ", "
        + "endpoint=" + endpoint + ", "
        + "simpleSearchParams=" + simpleSearchParams
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof ExternalApi) {
      ExternalApi that = (ExternalApi) o;
      return this.apiAuth.equals(that.apiAuth())
          && this.apiSpec.equals(that.apiSpec())
          && this.authConfig.equals(that.authConfig())
          && this.elasticSearchParams.equals(that.elasticSearchParams())
          && this.endpoint.equals(that.endpoint())
          && this.simpleSearchParams.equals(that.simpleSearchParams());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= apiAuth.hashCode();
    h$ *= 1000003;
    h$ ^= apiSpec.hashCode();
    h$ *= 1000003;
    h$ ^= authConfig.hashCode();
    h$ *= 1000003;
    h$ ^= elasticSearchParams.hashCode();
    h$ *= 1000003;
    h$ ^= endpoint.hashCode();
    h$ *= 1000003;
    h$ ^= simpleSearchParams.hashCode();
    return h$;
  }

  @Override
  public ExternalApi.Builder toBuilder() {
    return new AutoValue_ExternalApi.Builder(this);
  }

  static final class Builder extends ExternalApi.Builder {
    private Optional<ApiAuth> apiAuth = Optional.empty();
    private Optional<ApiSpec> apiSpec = Optional.empty();
    private Optional<AuthConfig> authConfig = Optional.empty();
    private Optional<ExternalApiElasticSearchParams> elasticSearchParams = Optional.empty();
    private Optional<String> endpoint = Optional.empty();
    private Optional<ExternalApiSimpleSearchParams> simpleSearchParams = Optional.empty();
    Builder() {
    }
    Builder(ExternalApi source) {
      this.apiAuth = source.apiAuth();
      this.apiSpec = source.apiSpec();
      this.authConfig = source.authConfig();
      this.elasticSearchParams = source.elasticSearchParams();
      this.endpoint = source.endpoint();
      this.simpleSearchParams = source.simpleSearchParams();
    }
    @Override
    public ExternalApi.Builder apiAuth(ApiAuth apiAuth) {
      this.apiAuth = Optional.of(apiAuth);
      return this;
    }
    @Override
    ExternalApi.Builder apiAuth(Optional<ApiAuth> apiAuth) {
      if (apiAuth == null) {
        throw new NullPointerException("Null apiAuth");
      }
      this.apiAuth = apiAuth;
      return this;
    }
    @Override
    public ExternalApi.Builder apiSpec(ApiSpec apiSpec) {
      this.apiSpec = Optional.of(apiSpec);
      return this;
    }
    @Override
    ExternalApi.Builder apiSpec(Optional<ApiSpec> apiSpec) {
      if (apiSpec == null) {
        throw new NullPointerException("Null apiSpec");
      }
      this.apiSpec = apiSpec;
      return this;
    }
    @Override
    public ExternalApi.Builder authConfig(AuthConfig authConfig) {
      this.authConfig = Optional.of(authConfig);
      return this;
    }
    @Override
    ExternalApi.Builder authConfig(Optional<AuthConfig> authConfig) {
      if (authConfig == null) {
        throw new NullPointerException("Null authConfig");
      }
      this.authConfig = authConfig;
      return this;
    }
    @Override
    public ExternalApi.Builder elasticSearchParams(ExternalApiElasticSearchParams elasticSearchParams) {
      this.elasticSearchParams = Optional.of(elasticSearchParams);
      return this;
    }
    @Override
    ExternalApi.Builder elasticSearchParams(Optional<ExternalApiElasticSearchParams> elasticSearchParams) {
      if (elasticSearchParams == null) {
        throw new NullPointerException("Null elasticSearchParams");
      }
      this.elasticSearchParams = elasticSearchParams;
      return this;
    }
    @Override
    public ExternalApi.Builder endpoint(String endpoint) {
      this.endpoint = Optional.of(endpoint);
      return this;
    }
    @Override
    ExternalApi.Builder endpoint(Optional<String> endpoint) {
      if (endpoint == null) {
        throw new NullPointerException("Null endpoint");
      }
      this.endpoint = endpoint;
      return this;
    }
    @Override
    public ExternalApi.Builder simpleSearchParams(ExternalApiSimpleSearchParams simpleSearchParams) {
      this.simpleSearchParams = Optional.of(simpleSearchParams);
      return this;
    }
    @Override
    ExternalApi.Builder simpleSearchParams(Optional<ExternalApiSimpleSearchParams> simpleSearchParams) {
      if (simpleSearchParams == null) {
        throw new NullPointerException("Null simpleSearchParams");
      }
      this.simpleSearchParams = simpleSearchParams;
      return this;
    }
    @Override
    public ExternalApi build() {
      return new AutoValue_ExternalApi(
          this.apiAuth,
          this.apiSpec,
          this.authConfig,
          this.elasticSearchParams,
          this.endpoint,
          this.simpleSearchParams);
    }
  }

}
