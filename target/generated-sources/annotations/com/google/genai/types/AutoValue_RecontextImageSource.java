package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_RecontextImageSource extends RecontextImageSource {

  private final Optional<String> prompt;

  private final Optional<Image> personImage;

  private final Optional<List<ProductImage>> productImages;

  private AutoValue_RecontextImageSource(
      Optional<String> prompt,
      Optional<Image> personImage,
      Optional<List<ProductImage>> productImages) {
    this.prompt = prompt;
    this.personImage = personImage;
    this.productImages = productImages;
  }

  @JsonProperty("prompt")
  @Override
  public Optional<String> prompt() {
    return prompt;
  }

  @JsonProperty("personImage")
  @Override
  public Optional<Image> personImage() {
    return personImage;
  }

  @JsonProperty("productImages")
  @Override
  public Optional<List<ProductImage>> productImages() {
    return productImages;
  }

  @Override
  public String toString() {
    return "RecontextImageSource{"
        + "prompt=" + prompt + ", "
        + "personImage=" + personImage + ", "
        + "productImages=" + productImages
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof RecontextImageSource) {
      RecontextImageSource that = (RecontextImageSource) o;
      return this.prompt.equals(that.prompt())
          && this.personImage.equals(that.personImage())
          && this.productImages.equals(that.productImages());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= prompt.hashCode();
    h$ *= 1000003;
    h$ ^= personImage.hashCode();
    h$ *= 1000003;
    h$ ^= productImages.hashCode();
    return h$;
  }

  @Override
  public RecontextImageSource.Builder toBuilder() {
    return new AutoValue_RecontextImageSource.Builder(this);
  }

  static final class Builder extends RecontextImageSource.Builder {
    private Optional<String> prompt = Optional.empty();
    private Optional<Image> personImage = Optional.empty();
    private Optional<List<ProductImage>> productImages = Optional.empty();
    Builder() {
    }
    Builder(RecontextImageSource source) {
      this.prompt = source.prompt();
      this.personImage = source.personImage();
      this.productImages = source.productImages();
    }
    @Override
    public RecontextImageSource.Builder prompt(String prompt) {
      this.prompt = Optional.of(prompt);
      return this;
    }
    @Override
    RecontextImageSource.Builder prompt(Optional<String> prompt) {
      if (prompt == null) {
        throw new NullPointerException("Null prompt");
      }
      this.prompt = prompt;
      return this;
    }
    @Override
    public RecontextImageSource.Builder personImage(Image personImage) {
      this.personImage = Optional.of(personImage);
      return this;
    }
    @Override
    RecontextImageSource.Builder personImage(Optional<Image> personImage) {
      if (personImage == null) {
        throw new NullPointerException("Null personImage");
      }
      this.personImage = personImage;
      return this;
    }
    @Override
    public RecontextImageSource.Builder productImages(List<ProductImage> productImages) {
      this.productImages = Optional.of(productImages);
      return this;
    }
    @Override
    RecontextImageSource.Builder productImages(Optional<List<ProductImage>> productImages) {
      if (productImages == null) {
        throw new NullPointerException("Null productImages");
      }
      this.productImages = productImages;
      return this;
    }
    @Override
    public RecontextImageSource build() {
      return new AutoValue_RecontextImageSource(
          this.prompt,
          this.personImage,
          this.productImages);
    }
  }

}
