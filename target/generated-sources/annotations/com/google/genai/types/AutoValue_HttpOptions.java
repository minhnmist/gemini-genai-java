package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_HttpOptions extends HttpOptions {

  private final Optional<String> baseUrl;

  private final Optional<String> apiVersion;

  private final Optional<Map<String, String>> headers;

  private final Optional<Integer> timeout;

  private final Optional<Map<String, Object>> extraBody;

  private final Optional<HttpRetryOptions> retryOptions;

  private AutoValue_HttpOptions(
      Optional<String> baseUrl,
      Optional<String> apiVersion,
      Optional<Map<String, String>> headers,
      Optional<Integer> timeout,
      Optional<Map<String, Object>> extraBody,
      Optional<HttpRetryOptions> retryOptions) {
    this.baseUrl = baseUrl;
    this.apiVersion = apiVersion;
    this.headers = headers;
    this.timeout = timeout;
    this.extraBody = extraBody;
    this.retryOptions = retryOptions;
  }

  @JsonProperty("baseUrl")
  @Override
  public Optional<String> baseUrl() {
    return baseUrl;
  }

  @JsonProperty("apiVersion")
  @Override
  public Optional<String> apiVersion() {
    return apiVersion;
  }

  @JsonProperty("headers")
  @Override
  public Optional<Map<String, String>> headers() {
    return headers;
  }

  @JsonProperty("timeout")
  @Override
  public Optional<Integer> timeout() {
    return timeout;
  }

  @JsonProperty("extraBody")
  @Override
  public Optional<Map<String, Object>> extraBody() {
    return extraBody;
  }

  @JsonProperty("retryOptions")
  @Override
  public Optional<HttpRetryOptions> retryOptions() {
    return retryOptions;
  }

  @Override
  public String toString() {
    return "HttpOptions{"
        + "baseUrl=" + baseUrl + ", "
        + "apiVersion=" + apiVersion + ", "
        + "headers=" + headers + ", "
        + "timeout=" + timeout + ", "
        + "extraBody=" + extraBody + ", "
        + "retryOptions=" + retryOptions
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof HttpOptions) {
      HttpOptions that = (HttpOptions) o;
      return this.baseUrl.equals(that.baseUrl())
          && this.apiVersion.equals(that.apiVersion())
          && this.headers.equals(that.headers())
          && this.timeout.equals(that.timeout())
          && this.extraBody.equals(that.extraBody())
          && this.retryOptions.equals(that.retryOptions());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= baseUrl.hashCode();
    h$ *= 1000003;
    h$ ^= apiVersion.hashCode();
    h$ *= 1000003;
    h$ ^= headers.hashCode();
    h$ *= 1000003;
    h$ ^= timeout.hashCode();
    h$ *= 1000003;
    h$ ^= extraBody.hashCode();
    h$ *= 1000003;
    h$ ^= retryOptions.hashCode();
    return h$;
  }

  @Override
  public HttpOptions.Builder toBuilder() {
    return new AutoValue_HttpOptions.Builder(this);
  }

  static final class Builder extends HttpOptions.Builder {
    private Optional<String> baseUrl = Optional.empty();
    private Optional<String> apiVersion = Optional.empty();
    private Optional<Map<String, String>> headers = Optional.empty();
    private Optional<Integer> timeout = Optional.empty();
    private Optional<Map<String, Object>> extraBody = Optional.empty();
    private Optional<HttpRetryOptions> retryOptions = Optional.empty();
    Builder() {
    }
    Builder(HttpOptions source) {
      this.baseUrl = source.baseUrl();
      this.apiVersion = source.apiVersion();
      this.headers = source.headers();
      this.timeout = source.timeout();
      this.extraBody = source.extraBody();
      this.retryOptions = source.retryOptions();
    }
    @Override
    public HttpOptions.Builder baseUrl(String baseUrl) {
      this.baseUrl = Optional.of(baseUrl);
      return this;
    }
    @Override
    HttpOptions.Builder baseUrl(Optional<String> baseUrl) {
      if (baseUrl == null) {
        throw new NullPointerException("Null baseUrl");
      }
      this.baseUrl = baseUrl;
      return this;
    }
    @Override
    public HttpOptions.Builder apiVersion(String apiVersion) {
      this.apiVersion = Optional.of(apiVersion);
      return this;
    }
    @Override
    HttpOptions.Builder apiVersion(Optional<String> apiVersion) {
      if (apiVersion == null) {
        throw new NullPointerException("Null apiVersion");
      }
      this.apiVersion = apiVersion;
      return this;
    }
    @Override
    public HttpOptions.Builder headers(Map<String, String> headers) {
      this.headers = Optional.of(headers);
      return this;
    }
    @Override
    HttpOptions.Builder headers(Optional<Map<String, String>> headers) {
      if (headers == null) {
        throw new NullPointerException("Null headers");
      }
      this.headers = headers;
      return this;
    }
    @Override
    public HttpOptions.Builder timeout(Integer timeout) {
      this.timeout = Optional.of(timeout);
      return this;
    }
    @Override
    HttpOptions.Builder timeout(Optional<Integer> timeout) {
      if (timeout == null) {
        throw new NullPointerException("Null timeout");
      }
      this.timeout = timeout;
      return this;
    }
    @Override
    public HttpOptions.Builder extraBody(Map<String, Object> extraBody) {
      this.extraBody = Optional.of(extraBody);
      return this;
    }
    @Override
    HttpOptions.Builder extraBody(Optional<Map<String, Object>> extraBody) {
      if (extraBody == null) {
        throw new NullPointerException("Null extraBody");
      }
      this.extraBody = extraBody;
      return this;
    }
    @Override
    public HttpOptions.Builder retryOptions(HttpRetryOptions retryOptions) {
      this.retryOptions = Optional.of(retryOptions);
      return this;
    }
    @Override
    HttpOptions.Builder retryOptions(Optional<HttpRetryOptions> retryOptions) {
      if (retryOptions == null) {
        throw new NullPointerException("Null retryOptions");
      }
      this.retryOptions = retryOptions;
      return this;
    }
    @Override
    public HttpOptions build() {
      return new AutoValue_HttpOptions(
          this.baseUrl,
          this.apiVersion,
          this.headers,
          this.timeout,
          this.extraBody,
          this.retryOptions);
    }
  }

}
