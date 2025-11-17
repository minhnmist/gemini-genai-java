package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_HttpResponse extends HttpResponse {

  private final Optional<Map<String, String>> headers;

  private final Optional<String> body;

  private AutoValue_HttpResponse(
      Optional<Map<String, String>> headers,
      Optional<String> body) {
    this.headers = headers;
    this.body = body;
  }

  @JsonProperty("headers")
  @Override
  public Optional<Map<String, String>> headers() {
    return headers;
  }

  @JsonProperty("body")
  @Override
  public Optional<String> body() {
    return body;
  }

  @Override
  public String toString() {
    return "HttpResponse{"
        + "headers=" + headers + ", "
        + "body=" + body
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof HttpResponse) {
      HttpResponse that = (HttpResponse) o;
      return this.headers.equals(that.headers())
          && this.body.equals(that.body());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= headers.hashCode();
    h$ *= 1000003;
    h$ ^= body.hashCode();
    return h$;
  }

  @Override
  public HttpResponse.Builder toBuilder() {
    return new AutoValue_HttpResponse.Builder(this);
  }

  static final class Builder extends HttpResponse.Builder {
    private Optional<Map<String, String>> headers = Optional.empty();
    private Optional<String> body = Optional.empty();
    Builder() {
    }
    Builder(HttpResponse source) {
      this.headers = source.headers();
      this.body = source.body();
    }
    @Override
    public HttpResponse.Builder headers(Map<String, String> headers) {
      this.headers = Optional.of(headers);
      return this;
    }
    @Override
    HttpResponse.Builder headers(Optional<Map<String, String>> headers) {
      if (headers == null) {
        throw new NullPointerException("Null headers");
      }
      this.headers = headers;
      return this;
    }
    @Override
    public HttpResponse.Builder body(String body) {
      this.body = Optional.of(body);
      return this;
    }
    @Override
    HttpResponse.Builder body(Optional<String> body) {
      if (body == null) {
        throw new NullPointerException("Null body");
      }
      this.body = body;
      return this;
    }
    @Override
    public HttpResponse build() {
      return new AutoValue_HttpResponse(
          this.headers,
          this.body);
    }
  }

}
