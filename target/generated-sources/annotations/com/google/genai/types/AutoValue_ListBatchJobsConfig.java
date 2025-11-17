package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_ListBatchJobsConfig extends ListBatchJobsConfig {

  private final Optional<HttpOptions> httpOptions;

  private final Optional<Integer> pageSize;

  private final Optional<String> pageToken;

  private final Optional<String> filter;

  private AutoValue_ListBatchJobsConfig(
      Optional<HttpOptions> httpOptions,
      Optional<Integer> pageSize,
      Optional<String> pageToken,
      Optional<String> filter) {
    this.httpOptions = httpOptions;
    this.pageSize = pageSize;
    this.pageToken = pageToken;
    this.filter = filter;
  }

  @JsonProperty("httpOptions")
  @Override
  public Optional<HttpOptions> httpOptions() {
    return httpOptions;
  }

  @JsonProperty("pageSize")
  @Override
  public Optional<Integer> pageSize() {
    return pageSize;
  }

  @JsonProperty("pageToken")
  @Override
  public Optional<String> pageToken() {
    return pageToken;
  }

  @JsonProperty("filter")
  @Override
  public Optional<String> filter() {
    return filter;
  }

  @Override
  public String toString() {
    return "ListBatchJobsConfig{"
        + "httpOptions=" + httpOptions + ", "
        + "pageSize=" + pageSize + ", "
        + "pageToken=" + pageToken + ", "
        + "filter=" + filter
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof ListBatchJobsConfig) {
      ListBatchJobsConfig that = (ListBatchJobsConfig) o;
      return this.httpOptions.equals(that.httpOptions())
          && this.pageSize.equals(that.pageSize())
          && this.pageToken.equals(that.pageToken())
          && this.filter.equals(that.filter());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= httpOptions.hashCode();
    h$ *= 1000003;
    h$ ^= pageSize.hashCode();
    h$ *= 1000003;
    h$ ^= pageToken.hashCode();
    h$ *= 1000003;
    h$ ^= filter.hashCode();
    return h$;
  }

  @Override
  public ListBatchJobsConfig.Builder toBuilder() {
    return new AutoValue_ListBatchJobsConfig.Builder(this);
  }

  static final class Builder extends ListBatchJobsConfig.Builder {
    private Optional<HttpOptions> httpOptions = Optional.empty();
    private Optional<Integer> pageSize = Optional.empty();
    private Optional<String> pageToken = Optional.empty();
    private Optional<String> filter = Optional.empty();
    Builder() {
    }
    Builder(ListBatchJobsConfig source) {
      this.httpOptions = source.httpOptions();
      this.pageSize = source.pageSize();
      this.pageToken = source.pageToken();
      this.filter = source.filter();
    }
    @Override
    public ListBatchJobsConfig.Builder httpOptions(HttpOptions httpOptions) {
      this.httpOptions = Optional.of(httpOptions);
      return this;
    }
    @Override
    ListBatchJobsConfig.Builder httpOptions(Optional<HttpOptions> httpOptions) {
      if (httpOptions == null) {
        throw new NullPointerException("Null httpOptions");
      }
      this.httpOptions = httpOptions;
      return this;
    }
    @Override
    public ListBatchJobsConfig.Builder pageSize(Integer pageSize) {
      this.pageSize = Optional.of(pageSize);
      return this;
    }
    @Override
    ListBatchJobsConfig.Builder pageSize(Optional<Integer> pageSize) {
      if (pageSize == null) {
        throw new NullPointerException("Null pageSize");
      }
      this.pageSize = pageSize;
      return this;
    }
    @Override
    public ListBatchJobsConfig.Builder pageToken(String pageToken) {
      this.pageToken = Optional.of(pageToken);
      return this;
    }
    @Override
    ListBatchJobsConfig.Builder pageToken(Optional<String> pageToken) {
      if (pageToken == null) {
        throw new NullPointerException("Null pageToken");
      }
      this.pageToken = pageToken;
      return this;
    }
    @Override
    public ListBatchJobsConfig.Builder filter(String filter) {
      this.filter = Optional.of(filter);
      return this;
    }
    @Override
    ListBatchJobsConfig.Builder filter(Optional<String> filter) {
      if (filter == null) {
        throw new NullPointerException("Null filter");
      }
      this.filter = filter;
      return this;
    }
    @Override
    public ListBatchJobsConfig build() {
      return new AutoValue_ListBatchJobsConfig(
          this.httpOptions,
          this.pageSize,
          this.pageToken,
          this.filter);
    }
  }

}
