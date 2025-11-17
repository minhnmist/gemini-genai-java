package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_FileSearch extends FileSearch {

  private final Optional<List<String>> fileSearchStoreNames;

  private final Optional<Integer> topK;

  private final Optional<String> metadataFilter;

  private AutoValue_FileSearch(
      Optional<List<String>> fileSearchStoreNames,
      Optional<Integer> topK,
      Optional<String> metadataFilter) {
    this.fileSearchStoreNames = fileSearchStoreNames;
    this.topK = topK;
    this.metadataFilter = metadataFilter;
  }

  @JsonProperty("fileSearchStoreNames")
  @Override
  public Optional<List<String>> fileSearchStoreNames() {
    return fileSearchStoreNames;
  }

  @JsonProperty("topK")
  @Override
  public Optional<Integer> topK() {
    return topK;
  }

  @JsonProperty("metadataFilter")
  @Override
  public Optional<String> metadataFilter() {
    return metadataFilter;
  }

  @Override
  public String toString() {
    return "FileSearch{"
        + "fileSearchStoreNames=" + fileSearchStoreNames + ", "
        + "topK=" + topK + ", "
        + "metadataFilter=" + metadataFilter
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof FileSearch) {
      FileSearch that = (FileSearch) o;
      return this.fileSearchStoreNames.equals(that.fileSearchStoreNames())
          && this.topK.equals(that.topK())
          && this.metadataFilter.equals(that.metadataFilter());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= fileSearchStoreNames.hashCode();
    h$ *= 1000003;
    h$ ^= topK.hashCode();
    h$ *= 1000003;
    h$ ^= metadataFilter.hashCode();
    return h$;
  }

  @Override
  public FileSearch.Builder toBuilder() {
    return new AutoValue_FileSearch.Builder(this);
  }

  static final class Builder extends FileSearch.Builder {
    private Optional<List<String>> fileSearchStoreNames = Optional.empty();
    private Optional<Integer> topK = Optional.empty();
    private Optional<String> metadataFilter = Optional.empty();
    Builder() {
    }
    Builder(FileSearch source) {
      this.fileSearchStoreNames = source.fileSearchStoreNames();
      this.topK = source.topK();
      this.metadataFilter = source.metadataFilter();
    }
    @Override
    public FileSearch.Builder fileSearchStoreNames(List<String> fileSearchStoreNames) {
      this.fileSearchStoreNames = Optional.of(fileSearchStoreNames);
      return this;
    }
    @Override
    FileSearch.Builder fileSearchStoreNames(Optional<List<String>> fileSearchStoreNames) {
      if (fileSearchStoreNames == null) {
        throw new NullPointerException("Null fileSearchStoreNames");
      }
      this.fileSearchStoreNames = fileSearchStoreNames;
      return this;
    }
    @Override
    public FileSearch.Builder topK(Integer topK) {
      this.topK = Optional.of(topK);
      return this;
    }
    @Override
    FileSearch.Builder topK(Optional<Integer> topK) {
      if (topK == null) {
        throw new NullPointerException("Null topK");
      }
      this.topK = topK;
      return this;
    }
    @Override
    public FileSearch.Builder metadataFilter(String metadataFilter) {
      this.metadataFilter = Optional.of(metadataFilter);
      return this;
    }
    @Override
    FileSearch.Builder metadataFilter(Optional<String> metadataFilter) {
      if (metadataFilter == null) {
        throw new NullPointerException("Null metadataFilter");
      }
      this.metadataFilter = metadataFilter;
      return this;
    }
    @Override
    public FileSearch build() {
      return new AutoValue_FileSearch(
          this.fileSearchStoreNames,
          this.topK,
          this.metadataFilter);
    }
  }

}
