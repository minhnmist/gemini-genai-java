package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_ListTuningJobsResponse extends ListTuningJobsResponse {

  private final Optional<HttpResponse> sdkHttpResponse;

  private final Optional<String> nextPageToken;

  private final Optional<List<TuningJob>> tuningJobs;

  private AutoValue_ListTuningJobsResponse(
      Optional<HttpResponse> sdkHttpResponse,
      Optional<String> nextPageToken,
      Optional<List<TuningJob>> tuningJobs) {
    this.sdkHttpResponse = sdkHttpResponse;
    this.nextPageToken = nextPageToken;
    this.tuningJobs = tuningJobs;
  }

  @JsonProperty("sdkHttpResponse")
  @Override
  public Optional<HttpResponse> sdkHttpResponse() {
    return sdkHttpResponse;
  }

  @JsonProperty("nextPageToken")
  @Override
  public Optional<String> nextPageToken() {
    return nextPageToken;
  }

  @JsonProperty("tuningJobs")
  @Override
  public Optional<List<TuningJob>> tuningJobs() {
    return tuningJobs;
  }

  @Override
  public String toString() {
    return "ListTuningJobsResponse{"
        + "sdkHttpResponse=" + sdkHttpResponse + ", "
        + "nextPageToken=" + nextPageToken + ", "
        + "tuningJobs=" + tuningJobs
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof ListTuningJobsResponse) {
      ListTuningJobsResponse that = (ListTuningJobsResponse) o;
      return this.sdkHttpResponse.equals(that.sdkHttpResponse())
          && this.nextPageToken.equals(that.nextPageToken())
          && this.tuningJobs.equals(that.tuningJobs());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= sdkHttpResponse.hashCode();
    h$ *= 1000003;
    h$ ^= nextPageToken.hashCode();
    h$ *= 1000003;
    h$ ^= tuningJobs.hashCode();
    return h$;
  }

  @Override
  public ListTuningJobsResponse.Builder toBuilder() {
    return new AutoValue_ListTuningJobsResponse.Builder(this);
  }

  static final class Builder extends ListTuningJobsResponse.Builder {
    private Optional<HttpResponse> sdkHttpResponse = Optional.empty();
    private Optional<String> nextPageToken = Optional.empty();
    private Optional<List<TuningJob>> tuningJobs = Optional.empty();
    Builder() {
    }
    Builder(ListTuningJobsResponse source) {
      this.sdkHttpResponse = source.sdkHttpResponse();
      this.nextPageToken = source.nextPageToken();
      this.tuningJobs = source.tuningJobs();
    }
    @Override
    public ListTuningJobsResponse.Builder sdkHttpResponse(HttpResponse sdkHttpResponse) {
      this.sdkHttpResponse = Optional.of(sdkHttpResponse);
      return this;
    }
    @Override
    ListTuningJobsResponse.Builder sdkHttpResponse(Optional<HttpResponse> sdkHttpResponse) {
      if (sdkHttpResponse == null) {
        throw new NullPointerException("Null sdkHttpResponse");
      }
      this.sdkHttpResponse = sdkHttpResponse;
      return this;
    }
    @Override
    public ListTuningJobsResponse.Builder nextPageToken(String nextPageToken) {
      this.nextPageToken = Optional.of(nextPageToken);
      return this;
    }
    @Override
    ListTuningJobsResponse.Builder nextPageToken(Optional<String> nextPageToken) {
      if (nextPageToken == null) {
        throw new NullPointerException("Null nextPageToken");
      }
      this.nextPageToken = nextPageToken;
      return this;
    }
    @Override
    public ListTuningJobsResponse.Builder tuningJobs(List<TuningJob> tuningJobs) {
      this.tuningJobs = Optional.of(tuningJobs);
      return this;
    }
    @Override
    ListTuningJobsResponse.Builder tuningJobs(Optional<List<TuningJob>> tuningJobs) {
      if (tuningJobs == null) {
        throw new NullPointerException("Null tuningJobs");
      }
      this.tuningJobs = tuningJobs;
      return this;
    }
    @Override
    public ListTuningJobsResponse build() {
      return new AutoValue_ListTuningJobsResponse(
          this.sdkHttpResponse,
          this.nextPageToken,
          this.tuningJobs);
    }
  }

}
