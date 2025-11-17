package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_EmbedContentMetadata extends EmbedContentMetadata {

  private final Optional<Integer> billableCharacterCount;

  private AutoValue_EmbedContentMetadata(
      Optional<Integer> billableCharacterCount) {
    this.billableCharacterCount = billableCharacterCount;
  }

  @JsonProperty("billableCharacterCount")
  @Override
  public Optional<Integer> billableCharacterCount() {
    return billableCharacterCount;
  }

  @Override
  public String toString() {
    return "EmbedContentMetadata{"
        + "billableCharacterCount=" + billableCharacterCount
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof EmbedContentMetadata) {
      EmbedContentMetadata that = (EmbedContentMetadata) o;
      return this.billableCharacterCount.equals(that.billableCharacterCount());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= billableCharacterCount.hashCode();
    return h$;
  }

  @Override
  public EmbedContentMetadata.Builder toBuilder() {
    return new AutoValue_EmbedContentMetadata.Builder(this);
  }

  static final class Builder extends EmbedContentMetadata.Builder {
    private Optional<Integer> billableCharacterCount = Optional.empty();
    Builder() {
    }
    Builder(EmbedContentMetadata source) {
      this.billableCharacterCount = source.billableCharacterCount();
    }
    @Override
    public EmbedContentMetadata.Builder billableCharacterCount(Integer billableCharacterCount) {
      this.billableCharacterCount = Optional.of(billableCharacterCount);
      return this;
    }
    @Override
    EmbedContentMetadata.Builder billableCharacterCount(Optional<Integer> billableCharacterCount) {
      if (billableCharacterCount == null) {
        throw new NullPointerException("Null billableCharacterCount");
      }
      this.billableCharacterCount = billableCharacterCount;
      return this;
    }
    @Override
    public EmbedContentMetadata build() {
      return new AutoValue_EmbedContentMetadata(
          this.billableCharacterCount);
    }
  }

}
