package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_ContentReferenceImage extends ContentReferenceImage {

  private final Optional<Image> referenceImage;

  private final Optional<Integer> referenceId;

  private final Optional<String> referenceType;

  private AutoValue_ContentReferenceImage(
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
    return "ContentReferenceImage{"
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
    if (o instanceof ContentReferenceImage) {
      ContentReferenceImage that = (ContentReferenceImage) o;
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
  public ContentReferenceImage.Builder toBuilder() {
    return new AutoValue_ContentReferenceImage.Builder(this);
  }

  static final class Builder extends ContentReferenceImage.Builder {
    private Optional<Image> referenceImage = Optional.empty();
    private Optional<Integer> referenceId = Optional.empty();
    private Optional<String> referenceType = Optional.empty();
    Builder() {
    }
    Builder(ContentReferenceImage source) {
      this.referenceImage = source.referenceImage();
      this.referenceId = source.referenceId();
      this.referenceType = source.referenceType();
    }
    @Override
    public ContentReferenceImage.Builder referenceImage(Image referenceImage) {
      this.referenceImage = Optional.of(referenceImage);
      return this;
    }
    @Override
    ContentReferenceImage.Builder referenceImage(Optional<Image> referenceImage) {
      if (referenceImage == null) {
        throw new NullPointerException("Null referenceImage");
      }
      this.referenceImage = referenceImage;
      return this;
    }
    @Override
    public ContentReferenceImage.Builder referenceId(Integer referenceId) {
      this.referenceId = Optional.of(referenceId);
      return this;
    }
    @Override
    ContentReferenceImage.Builder referenceId(Optional<Integer> referenceId) {
      if (referenceId == null) {
        throw new NullPointerException("Null referenceId");
      }
      this.referenceId = referenceId;
      return this;
    }
    @Override
    public ContentReferenceImage.Builder referenceType(String referenceType) {
      this.referenceType = Optional.of(referenceType);
      return this;
    }
    @Override
    ContentReferenceImage.Builder referenceType(Optional<String> referenceType) {
      if (referenceType == null) {
        throw new NullPointerException("Null referenceType");
      }
      this.referenceType = referenceType;
      return this;
    }
    @Override
    public ContentReferenceImage build() {
      return new AutoValue_ContentReferenceImage(
          this.referenceImage,
          this.referenceId,
          this.referenceType);
    }
  }

}
