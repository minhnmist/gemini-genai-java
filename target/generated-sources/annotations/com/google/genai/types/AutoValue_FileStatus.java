package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_FileStatus extends FileStatus {

  private final Optional<List<Map<String, Object>>> details;

  private final Optional<String> message;

  private final Optional<Integer> code;

  private AutoValue_FileStatus(
      Optional<List<Map<String, Object>>> details,
      Optional<String> message,
      Optional<Integer> code) {
    this.details = details;
    this.message = message;
    this.code = code;
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

  @JsonProperty("code")
  @Override
  public Optional<Integer> code() {
    return code;
  }

  @Override
  public String toString() {
    return "FileStatus{"
        + "details=" + details + ", "
        + "message=" + message + ", "
        + "code=" + code
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof FileStatus) {
      FileStatus that = (FileStatus) o;
      return this.details.equals(that.details())
          && this.message.equals(that.message())
          && this.code.equals(that.code());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= details.hashCode();
    h$ *= 1000003;
    h$ ^= message.hashCode();
    h$ *= 1000003;
    h$ ^= code.hashCode();
    return h$;
  }

  @Override
  public FileStatus.Builder toBuilder() {
    return new AutoValue_FileStatus.Builder(this);
  }

  static final class Builder extends FileStatus.Builder {
    private Optional<List<Map<String, Object>>> details = Optional.empty();
    private Optional<String> message = Optional.empty();
    private Optional<Integer> code = Optional.empty();
    Builder() {
    }
    Builder(FileStatus source) {
      this.details = source.details();
      this.message = source.message();
      this.code = source.code();
    }
    @Override
    public FileStatus.Builder details(List<Map<String, Object>> details) {
      this.details = Optional.of(details);
      return this;
    }
    @Override
    FileStatus.Builder details(Optional<List<Map<String, Object>>> details) {
      if (details == null) {
        throw new NullPointerException("Null details");
      }
      this.details = details;
      return this;
    }
    @Override
    public FileStatus.Builder message(String message) {
      this.message = Optional.of(message);
      return this;
    }
    @Override
    FileStatus.Builder message(Optional<String> message) {
      if (message == null) {
        throw new NullPointerException("Null message");
      }
      this.message = message;
      return this;
    }
    @Override
    public FileStatus.Builder code(Integer code) {
      this.code = Optional.of(code);
      return this;
    }
    @Override
    FileStatus.Builder code(Optional<Integer> code) {
      if (code == null) {
        throw new NullPointerException("Null code");
      }
      this.code = code;
      return this;
    }
    @Override
    public FileStatus build() {
      return new AutoValue_FileStatus(
          this.details,
          this.message,
          this.code);
    }
  }

}
