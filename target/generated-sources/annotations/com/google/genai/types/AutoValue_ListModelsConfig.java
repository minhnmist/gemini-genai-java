package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_ListModelsConfig extends ListModelsConfig {

  private final Optional<HttpOptions> httpOptions;

  private final Optional<Integer> pageSize;

  private final Optional<String> pageToken;

  private final Optional<String> filter;

  private final Optional<Boolean> queryBase;

  private AutoValue_ListModelsConfig(
      Optional<HttpOptions> httpOptions,
      Optional<Integer> pageSize,
      Optional<String> pageToken,
      Optional<String> filter,
      Optional<Boolean> queryBase) {
    this.httpOptions = httpOptions;
    this.pageSize = pageSize;
    this.pageToken = pageToken;
    this.filter = filter;
    this.queryBase = queryBase;
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

  @JsonProperty("queryBase")
  @Override
  public Optional<Boolean> queryBase() {
    return queryBase;
  }

  @Override
  public String toString() {
    return "ListModelsConfig{"
        + "httpOptions=" + httpOptions + ", "
        + "pageSize=" + pageSize + ", "
        + "pageToken=" + pageToken + ", "
        + "filter=" + filter + ", "
        + "queryBase=" + queryBase
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof ListModelsConfig) {
      ListModelsConfig that = (ListModelsConfig) o;
      return this.httpOptions.equals(that.httpOptions())
          && this.pageSize.equals(that.pageSize())
          && this.pageToken.equals(that.pageToken())
          && this.filter.equals(that.filter())
          && this.queryBase.equals(that.queryBase());
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
    h$ *= 1000003;
    h$ ^= queryBase.hashCode();
    return h$;
  }

  @Override
  public ListModelsConfig.Builder toBuilder() {
    return new AutoValue_ListModelsConfig.Builder(this);
  }

  static final class Builder extends ListModelsConfig.Builder {
    private Optional<HttpOptions> httpOptions = Optional.empty();
    private Optional<Integer> pageSize = Optional.empty();
    private Optional<String> pageToken = Optional.empty();
    private Optional<String> filter = Optional.empty();
    private Optional<Boolean> queryBase = Optional.empty();
    Builder() {
    }
    Builder(ListModelsConfig source) {
      this.httpOptions = source.httpOptions();
      this.pageSize = source.pageSize();
      this.pageToken = source.pageToken();
      this.filter = source.filter();
      this.queryBase = source.queryBase();
    }
    @Override
    public ListModelsConfig.Builder httpOptions(HttpOptions httpOptions) {
      this.httpOptions = Optional.of(httpOptions);
      return this;
    }
    @Override
    ListModelsConfig.Builder httpOptions(Optional<HttpOptions> httpOptions) {
      if (httpOptions == null) {
        throw new NullPointerException("Null httpOptions");
      }
      this.httpOptions = httpOptions;
      return this;
    }
    @Override
    public ListModelsConfig.Builder pageSize(Integer pageSize) {
      this.pageSize = Optional.of(pageSize);
      return this;
    }
    @Override
    ListModelsConfig.Builder pageSize(Optional<Integer> pageSize) {
      if (pageSize == null) {
        throw new NullPointerException("Null pageSize");
      }
      this.pageSize = pageSize;
      return this;
    }
    @Override
    public ListModelsConfig.Builder pageToken(String pageToken) {
      this.pageToken = Optional.of(pageToken);
      return this;
    }
    @Override
    ListModelsConfig.Builder pageToken(Optional<String> pageToken) {
      if (pageToken == null) {
        throw new NullPointerException("Null pageToken");
      }
      this.pageToken = pageToken;
      return this;
    }
    @Override
    public ListModelsConfig.Builder filter(String filter) {
      this.filter = Optional.of(filter);
      return this;
    }
    @Override
    ListModelsConfig.Builder filter(Optional<String> filter) {
      if (filter == null) {
        throw new NullPointerException("Null filter");
      }
      this.filter = filter;
      return this;
    }
    @Override
    public ListModelsConfig.Builder queryBase(boolean queryBase) {
      this.queryBase = Optional.of(queryBase);
      return this;
    }
    @Override
    ListModelsConfig.Builder queryBase(Optional<Boolean> queryBase) {
      if (queryBase == null) {
        throw new NullPointerException("Null queryBase");
      }
      this.queryBase = queryBase;
      return this;
    }
    @Override
    public ListModelsConfig build() {
      return new AutoValue_ListModelsConfig(
          this.httpOptions,
          this.pageSize,
          this.pageToken,
          this.filter,
          this.queryBase);
    }
  }

}
