package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_ListFilesConfig extends ListFilesConfig {

  private final Optional<HttpOptions> httpOptions;

  private final Optional<Integer> pageSize;

  private final Optional<String> pageToken;

  private AutoValue_ListFilesConfig(
      Optional<HttpOptions> httpOptions,
      Optional<Integer> pageSize,
      Optional<String> pageToken) {
    this.httpOptions = httpOptions;
    this.pageSize = pageSize;
    this.pageToken = pageToken;
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

  @Override
  public String toString() {
    return "ListFilesConfig{"
        + "httpOptions=" + httpOptions + ", "
        + "pageSize=" + pageSize + ", "
        + "pageToken=" + pageToken
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof ListFilesConfig) {
      ListFilesConfig that = (ListFilesConfig) o;
      return this.httpOptions.equals(that.httpOptions())
          && this.pageSize.equals(that.pageSize())
          && this.pageToken.equals(that.pageToken());
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
    return h$;
  }

  @Override
  public ListFilesConfig.Builder toBuilder() {
    return new AutoValue_ListFilesConfig.Builder(this);
  }

  static final class Builder extends ListFilesConfig.Builder {
    private Optional<HttpOptions> httpOptions = Optional.empty();
    private Optional<Integer> pageSize = Optional.empty();
    private Optional<String> pageToken = Optional.empty();
    Builder() {
    }
    Builder(ListFilesConfig source) {
      this.httpOptions = source.httpOptions();
      this.pageSize = source.pageSize();
      this.pageToken = source.pageToken();
    }
    @Override
    public ListFilesConfig.Builder httpOptions(HttpOptions httpOptions) {
      this.httpOptions = Optional.of(httpOptions);
      return this;
    }
    @Override
    ListFilesConfig.Builder httpOptions(Optional<HttpOptions> httpOptions) {
      if (httpOptions == null) {
        throw new NullPointerException("Null httpOptions");
      }
      this.httpOptions = httpOptions;
      return this;
    }
    @Override
    public ListFilesConfig.Builder pageSize(Integer pageSize) {
      this.pageSize = Optional.of(pageSize);
      return this;
    }
    @Override
    ListFilesConfig.Builder pageSize(Optional<Integer> pageSize) {
      if (pageSize == null) {
        throw new NullPointerException("Null pageSize");
      }
      this.pageSize = pageSize;
      return this;
    }
    @Override
    public ListFilesConfig.Builder pageToken(String pageToken) {
      this.pageToken = Optional.of(pageToken);
      return this;
    }
    @Override
    ListFilesConfig.Builder pageToken(Optional<String> pageToken) {
      if (pageToken == null) {
        throw new NullPointerException("Null pageToken");
      }
      this.pageToken = pageToken;
      return this;
    }
    @Override
    public ListFilesConfig build() {
      return new AutoValue_ListFilesConfig(
          this.httpOptions,
          this.pageSize,
          this.pageToken);
    }
  }

}
