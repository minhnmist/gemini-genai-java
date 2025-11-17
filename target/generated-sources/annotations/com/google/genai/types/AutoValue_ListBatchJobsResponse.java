package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_ListBatchJobsResponse extends ListBatchJobsResponse {

  private final Optional<HttpResponse> sdkHttpResponse;

  private final Optional<String> nextPageToken;

  private final Optional<List<BatchJob>> batchJobs;

  private AutoValue_ListBatchJobsResponse(
      Optional<HttpResponse> sdkHttpResponse,
      Optional<String> nextPageToken,
      Optional<List<BatchJob>> batchJobs) {
    this.sdkHttpResponse = sdkHttpResponse;
    this.nextPageToken = nextPageToken;
    this.batchJobs = batchJobs;
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

  @JsonProperty("batchJobs")
  @Override
  public Optional<List<BatchJob>> batchJobs() {
    return batchJobs;
  }

  @Override
  public String toString() {
    return "ListBatchJobsResponse{"
        + "sdkHttpResponse=" + sdkHttpResponse + ", "
        + "nextPageToken=" + nextPageToken + ", "
        + "batchJobs=" + batchJobs
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof ListBatchJobsResponse) {
      ListBatchJobsResponse that = (ListBatchJobsResponse) o;
      return this.sdkHttpResponse.equals(that.sdkHttpResponse())
          && this.nextPageToken.equals(that.nextPageToken())
          && this.batchJobs.equals(that.batchJobs());
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
    h$ ^= batchJobs.hashCode();
    return h$;
  }

  @Override
  public ListBatchJobsResponse.Builder toBuilder() {
    return new AutoValue_ListBatchJobsResponse.Builder(this);
  }

  static final class Builder extends ListBatchJobsResponse.Builder {
    private Optional<HttpResponse> sdkHttpResponse = Optional.empty();
    private Optional<String> nextPageToken = Optional.empty();
    private Optional<List<BatchJob>> batchJobs = Optional.empty();
    Builder() {
    }
    Builder(ListBatchJobsResponse source) {
      this.sdkHttpResponse = source.sdkHttpResponse();
      this.nextPageToken = source.nextPageToken();
      this.batchJobs = source.batchJobs();
    }
    @Override
    public ListBatchJobsResponse.Builder sdkHttpResponse(HttpResponse sdkHttpResponse) {
      this.sdkHttpResponse = Optional.of(sdkHttpResponse);
      return this;
    }
    @Override
    ListBatchJobsResponse.Builder sdkHttpResponse(Optional<HttpResponse> sdkHttpResponse) {
      if (sdkHttpResponse == null) {
        throw new NullPointerException("Null sdkHttpResponse");
      }
      this.sdkHttpResponse = sdkHttpResponse;
      return this;
    }
    @Override
    public ListBatchJobsResponse.Builder nextPageToken(String nextPageToken) {
      this.nextPageToken = Optional.of(nextPageToken);
      return this;
    }
    @Override
    ListBatchJobsResponse.Builder nextPageToken(Optional<String> nextPageToken) {
      if (nextPageToken == null) {
        throw new NullPointerException("Null nextPageToken");
      }
      this.nextPageToken = nextPageToken;
      return this;
    }
    @Override
    public ListBatchJobsResponse.Builder batchJobs(List<BatchJob> batchJobs) {
      this.batchJobs = Optional.of(batchJobs);
      return this;
    }
    @Override
    ListBatchJobsResponse.Builder batchJobs(Optional<List<BatchJob>> batchJobs) {
      if (batchJobs == null) {
        throw new NullPointerException("Null batchJobs");
      }
      this.batchJobs = batchJobs;
      return this;
    }
    @Override
    public ListBatchJobsResponse build() {
      return new AutoValue_ListBatchJobsResponse(
          this.sdkHttpResponse,
          this.nextPageToken,
          this.batchJobs);
    }
  }

}
