package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_InlinedResponse extends InlinedResponse {

  private final Optional<GenerateContentResponse> response;

  private final Optional<JobError> error;

  private AutoValue_InlinedResponse(
      Optional<GenerateContentResponse> response,
      Optional<JobError> error) {
    this.response = response;
    this.error = error;
  }

  @JsonProperty("response")
  @Override
  public Optional<GenerateContentResponse> response() {
    return response;
  }

  @JsonProperty("error")
  @Override
  public Optional<JobError> error() {
    return error;
  }

  @Override
  public String toString() {
    return "InlinedResponse{"
        + "response=" + response + ", "
        + "error=" + error
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof InlinedResponse) {
      InlinedResponse that = (InlinedResponse) o;
      return this.response.equals(that.response())
          && this.error.equals(that.error());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= response.hashCode();
    h$ *= 1000003;
    h$ ^= error.hashCode();
    return h$;
  }

  @Override
  public InlinedResponse.Builder toBuilder() {
    return new AutoValue_InlinedResponse.Builder(this);
  }

  static final class Builder extends InlinedResponse.Builder {
    private Optional<GenerateContentResponse> response = Optional.empty();
    private Optional<JobError> error = Optional.empty();
    Builder() {
    }
    Builder(InlinedResponse source) {
      this.response = source.response();
      this.error = source.error();
    }
    @Override
    public InlinedResponse.Builder response(GenerateContentResponse response) {
      this.response = Optional.of(response);
      return this;
    }
    @Override
    InlinedResponse.Builder response(Optional<GenerateContentResponse> response) {
      if (response == null) {
        throw new NullPointerException("Null response");
      }
      this.response = response;
      return this;
    }
    @Override
    public InlinedResponse.Builder error(JobError error) {
      this.error = Optional.of(error);
      return this;
    }
    @Override
    InlinedResponse.Builder error(Optional<JobError> error) {
      if (error == null) {
        throw new NullPointerException("Null error");
      }
      this.error = error;
      return this;
    }
    @Override
    public InlinedResponse build() {
      return new AutoValue_InlinedResponse(
          this.response,
          this.error);
    }
  }

}
