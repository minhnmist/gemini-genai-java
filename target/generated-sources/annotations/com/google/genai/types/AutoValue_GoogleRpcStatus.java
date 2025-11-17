package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_GoogleRpcStatus extends GoogleRpcStatus {

  private final Optional<Integer> code;

  private final Optional<List<Map<String, Object>>> details;

  private final Optional<String> message;

  private AutoValue_GoogleRpcStatus(
      Optional<Integer> code,
      Optional<List<Map<String, Object>>> details,
      Optional<String> message) {
    this.code = code;
    this.details = details;
    this.message = message;
  }

  @JsonProperty("code")
  @Override
  public Optional<Integer> code() {
    return code;
  }

  @JsonProperty("details")
  @Override
  public Optional<List<Map<String, Object>>> details() {
    return details;
  }

  @JsonProperty("message")
  @Override
  public Optional<String> message() {
    return message;
  }

  @Override
  public String toString() {
    return "GoogleRpcStatus{"
        + "code=" + code + ", "
        + "details=" + details + ", "
        + "message=" + message
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof GoogleRpcStatus) {
      GoogleRpcStatus that = (GoogleRpcStatus) o;
      return this.code.equals(that.code())
          && this.details.equals(that.details())
          && this.message.equals(that.message());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= code.hashCode();
    h$ *= 1000003;
    h$ ^= details.hashCode();
    h$ *= 1000003;
    h$ ^= message.hashCode();
    return h$;
  }

  @Override
  public GoogleRpcStatus.Builder toBuilder() {
    return new AutoValue_GoogleRpcStatus.Builder(this);
  }

  static final class Builder extends GoogleRpcStatus.Builder {
    private Optional<Integer> code = Optional.empty();
    private Optional<List<Map<String, Object>>> details = Optional.empty();
    private Optional<String> message = Optional.empty();
    Builder() {
    }
    Builder(GoogleRpcStatus source) {
      this.code = source.code();
      this.details = source.details();
      this.message = source.message();
    }
    @Override
    public GoogleRpcStatus.Builder code(Integer code) {
      this.code = Optional.of(code);
      return this;
    }
    @Override
    GoogleRpcStatus.Builder code(Optional<Integer> code) {
      if (code == null) {
        throw new NullPointerException("Null code");
      }
      this.code = code;
      return this;
    }
    @Override
    public GoogleRpcStatus.Builder details(List<Map<String, Object>> details) {
      this.details = Optional.of(details);
      return this;
    }
    @Override
    GoogleRpcStatus.Builder details(Optional<List<Map<String, Object>>> details) {
      if (details == null) {
        throw new NullPointerException("Null details");
      }
      this.details = details;
      return this;
    }
    @Override
    public GoogleRpcStatus.Builder message(String message) {
      this.message = Optional.of(message);
      return this;
    }
    @Override
    GoogleRpcStatus.Builder message(Optional<String> message) {
      if (message == null) {
        throw new NullPointerException("Null message");
      }
      this.message = message;
      return this;
    }
    @Override
    public GoogleRpcStatus build() {
      return new AutoValue_GoogleRpcStatus(
          this.code,
          this.details,
          this.message);
    }
  }

}
