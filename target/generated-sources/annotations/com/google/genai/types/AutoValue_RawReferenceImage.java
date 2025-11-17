package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_RawReferenceImage extends RawReferenceImage {

  private final Optional<Image> referenceImage;

  private final Optional<Integer> referenceId;

  private final Optional<String> referenceType;

  private AutoValue_RawReferenceImage(
      Optional<Image> referenceImage,
      Optional<Integer> referenceId,
      Optional<String> referenceType) {
    this.referenceImage = referenceImage;
    this.referenceId = referenceId;
    this.referenceType = referenceType;
  }

  @JsonProperty("referenceImage")
  @Override
  public Optional<Image> referenceImage() {
    return referenceImage;
  }

  @JsonProperty("referenceId")
  @Override
  public Optional<Integer> referenceId() {
    return referenceId;
  }

  @JsonProperty("referenceType")
  @Override
  public Optional<String> referenceType() {
    return referenceType;
  }

  @Override
  public String toString() {
    return "RawReferenceImage{"
        + "referenceImage=" + referenceImage + ", "
        + "referenceId=" + referenceId + ", "
        + "referenceType=" + referenceType
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof RawReferenceImage) {
      RawReferenceImage that = (RawReferenceImage) o;
      return this.referenceImage.equals(that.referenceImage())
          && this.referenceId.equals(that.referenceId())
          && this.referenceType.equals(that.referenceType());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= referenceImage.hashCode();
    h$ *= 1000003;
    h$ ^= referenceId.hashCode();
    h$ *= 1000003;
    h$ ^= referenceType.hashCode();
    return h$;
  }

  @Override
  public RawReferenceImage.Builder toBuilder() {
    return new AutoValue_RawReferenceImage.Builder(this);
  }

  static final class Builder extends RawReferenceImage.Builder {
    private Optional<Image> referenceImage = Optional.empty();
    private Optional<Integer> referenceId = Optional.empty();
    private Optional<String> referenceType = Optional.empty();
    Builder() {
    }
    Builder(RawReferenceImage source) {
      this.referenceImage = source.referenceImage();
      this.referenceId = source.referenceId();
      this.referenceType = source.referenceType();
    }
    @Override
    public RawReferenceImage.Builder referenceImage(Image referenceImage) {
      this.referenceImage = Optional.of(referenceImage);
      return this;
    }
    @Override
    RawReferenceImage.Builder referenceImage(Optional<Image> referenceImage) {
      if (referenceImage == null) {
        throw new NullPointerException("Null referenceImage");
      }
      this.referenceImage = referenceImage;
      return this;
    }
    @Override
    public RawReferenceImage.Builder referenceId(Integer referenceId) {
      this.referenceId = Optional.of(referenceId);
      return this;
    }
    @Override
    RawReferenceImage.Builder referenceId(Optional<Integer> referenceId) {
      if (referenceId == null) {
        throw new NullPointerException("Null referenceId");
      }
      this.referenceId = referenceId;
      return this;
    }
    @Override
    public RawReferenceImage.Builder referenceType(String referenceType) {
      this.referenceType = Optional.of(referenceType);
      return this;
    }
    @Override
    RawReferenceImage.Builder referenceType(Optional<String> referenceType) {
      if (referenceType == null) {
        throw new NullPointerException("Null referenceType");
      }
      this.referenceType = referenceType;
      return this;
    }
    @Override
    public RawReferenceImage build() {
      return new AutoValue_RawReferenceImage(
          this.referenceImage,
          this.referenceId,
          this.referenceType);
    }
  }

}
