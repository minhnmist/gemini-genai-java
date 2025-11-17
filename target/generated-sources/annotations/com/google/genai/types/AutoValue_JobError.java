package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_JobError extends JobError {

  private final Optional<List<String>> details;

  private final Optional<Integer> code;

  private final Optional<String> message;

  private AutoValue_JobError(
      Optional<List<String>> details,
      Optional<Integer> code,
      Optional<String> message) {
    this.details = details;
    this.code = code;
    this.message = message;
  }

  @JsonProperty("details")
  @Override
  public Optional<List<String>> details() {
    return details;
  }

  @JsonProperty("code")
  @Override
  public Optional<Integer> code() {
    return code;
  }

  @JsonProperty("message")
  @Override
  public Optional<String> message() {
    return message;
  }

  @Override
  public String toString() {
    return "JobError{"
        + "details=" + details + ", "
        + "code=" + code + ", "
        + "message=" + message
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof JobError) {
      JobError that = (JobError) o;
      return this.details.equals(that.details())
          && this.code.equals(that.code())
          && this.message.equals(that.message());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= details.hashCode();
    h$ *= 1000003;
    h$ ^= code.hashCode();
    h$ *= 1000003;
    h$ ^= message.hashCode();
    return h$;
  }

  @Override
  public JobError.Builder toBuilder() {
    return new AutoValue_JobError.Builder(this);
  }

  static final class Builder extends JobError.Builder {
    private Optional<List<String>> details = Optional.empty();
    private Optional<Integer> code = Optional.empty();
    private Optional<String> message = Optional.empty();
    Builder() {
    }
    Builder(JobError source) {
      this.details = source.details();
      this.code = source.code();
      this.message = source.message();
    }
    @Override
    public JobError.Builder details(List<String> details) {
      this.details = Optional.of(details);
      return this;
    }
    @Override
    JobError.Builder details(Optional<List<String>> details) {
      if (details == null) {
        throw new NullPointerException("Null details");
      }
      this.details = details;
      return this;
    }
    @Override
    public JobError.Builder code(Integer code) {
      this.code = Optional.of(code);
      return this;
    }
    @Override
    JobError.Builder code(Optional<Integer> code) {
      if (code == null) {
        throw new NullPointerException("Null code");
      }
      this.code = code;
      return this;
    }
    @Override
    public JobError.Builder message(String message) {
      this.message = Optional.of(message);
      return this;
    }
    @Override
    JobError.Builder message(Optional<String> message) {
      if (message == null) {
        throw new NullPointerException("Null message");
      }
      this.message = message;
      return this;
    }
    @Override
    public JobError build() {
      return new AutoValue_JobError(
          this.details,
          this.code,
          this.message);
    }
  }

}
