package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_InlinedEmbedContentResponse extends InlinedEmbedContentResponse {

  private final Optional<SingleEmbedContentResponse> response;

  private final Optional<JobError> error;

  private AutoValue_InlinedEmbedContentResponse(
      Optional<SingleEmbedContentResponse> response,
      Optional<JobError> error) {
    this.response = response;
    this.error = error;
  }

  @JsonProperty("response")
  @Override
  public Optional<SingleEmbedContentResponse> response() {
    return response;
  }

  @JsonProperty("error")
  @Override
  public Optional<JobError> error() {
    return error;
  }

  @Override
  public String toString() {
    return "InlinedEmbedContentResponse{"
        + "response=" + response + ", "
        + "error=" + error
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof InlinedEmbedContentResponse) {
      InlinedEmbedContentResponse that = (InlinedEmbedContentResponse) o;
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
  public InlinedEmbedContentResponse.Builder toBuilder() {
    return new AutoValue_InlinedEmbedContentResponse.Builder(this);
  }

  static final class Builder extends InlinedEmbedContentResponse.Builder {
    private Optional<SingleEmbedContentResponse> response = Optional.empty();
    private Optional<JobError> error = Optional.empty();
    Builder() {
    }
    Builder(InlinedEmbedContentResponse source) {
      this.response = source.response();
      this.error = source.error();
    }
    @Override
    public InlinedEmbedContentResponse.Builder response(SingleEmbedContentResponse response) {
      this.response = Optional.of(response);
      return this;
    }
    @Override
    InlinedEmbedContentResponse.Builder response(Optional<SingleEmbedContentResponse> response) {
      if (response == null) {
        throw new NullPointerException("Null response");
      }
      this.response = response;
      return this;
    }
    @Override
    public InlinedEmbedContentResponse.Builder error(JobError error) {
      this.error = Optional.of(error);
      return this;
    }
    @Override
    InlinedEmbedContentResponse.Builder error(Optional<JobError> error) {
      if (error == null) {
        throw new NullPointerException("Null error");
      }
      this.error = error;
      return this;
    }
    @Override
    public InlinedEmbedContentResponse build() {
      return new AutoValue_InlinedEmbedContentResponse(
          this.response,
          this.error);
    }
  }

}
