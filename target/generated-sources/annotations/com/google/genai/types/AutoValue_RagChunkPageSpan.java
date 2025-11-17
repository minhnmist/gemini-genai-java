package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_RagChunkPageSpan extends RagChunkPageSpan {

  private final Optional<Integer> firstPage;

  private final Optional<Integer> lastPage;

  private AutoValue_RagChunkPageSpan(
      Optional<Integer> firstPage,
      Optional<Integer> lastPage) {
    this.firstPage = firstPage;
    this.lastPage = lastPage;
  }

  @JsonProperty("firstPage")
  @Override
  public Optional<Integer> firstPage() {
    return firstPage;
  }

  @JsonProperty("lastPage")
  @Override
  public Optional<Integer> lastPage() {
    return lastPage;
  }

  @Override
  public String toString() {
    return "RagChunkPageSpan{"
        + "firstPage=" + firstPage + ", "
        + "lastPage=" + lastPage
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof RagChunkPageSpan) {
      RagChunkPageSpan that = (RagChunkPageSpan) o;
      return this.firstPage.equals(that.firstPage())
          && this.lastPage.equals(that.lastPage());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= firstPage.hashCode();
    h$ *= 1000003;
    h$ ^= lastPage.hashCode();
    return h$;
  }

  @Override
  public RagChunkPageSpan.Builder toBuilder() {
    return new AutoValue_RagChunkPageSpan.Builder(this);
  }

  static final class Builder extends RagChunkPageSpan.Builder {
    private Optional<Integer> firstPage = Optional.empty();
    private Optional<Integer> lastPage = Optional.empty();
    Builder() {
    }
    Builder(RagChunkPageSpan source) {
      this.firstPage = source.firstPage();
      this.lastPage = source.lastPage();
    }
    @Override
    public RagChunkPageSpan.Builder firstPage(Integer firstPage) {
      this.firstPage = Optional.of(firstPage);
      return this;
    }
    @Override
    RagChunkPageSpan.Builder firstPage(Optional<Integer> firstPage) {
      if (firstPage == null) {
        throw new NullPointerException("Null firstPage");
      }
      this.firstPage = firstPage;
      return this;
    }
    @Override
    public RagChunkPageSpan.Builder lastPage(Integer lastPage) {
      this.lastPage = Optional.of(lastPage);
      return this;
    }
    @Override
    RagChunkPageSpan.Builder lastPage(Optional<Integer> lastPage) {
      if (lastPage == null) {
        throw new NullPointerException("Null lastPage");
      }
      this.lastPage = lastPage;
      return this;
    }
    @Override
    public RagChunkPageSpan build() {
      return new AutoValue_RagChunkPageSpan(
          this.firstPage,
          this.lastPage);
    }
  }

}
