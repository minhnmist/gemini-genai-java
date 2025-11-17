package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_ProductImage extends ProductImage {

  private final Optional<Image> productImage;

  private AutoValue_ProductImage(
      Optional<Image> productImage) {
    this.productImage = productImage;
  }

  @JsonProperty("productImage")
  @Override
  public Optional<Image> productImage() {
    return productImage;
  }

  @Override
  public String toString() {
    return "ProductImage{"
        + "productImage=" + productImage
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof ProductImage) {
      ProductImage that = (ProductImage) o;
      return this.productImage.equals(that.productImage());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= productImage.hashCode();
    return h$;
  }

  @Override
  public ProductImage.Builder toBuilder() {
    return new AutoValue_ProductImage.Builder(this);
  }

  static final class Builder extends ProductImage.Builder {
    private Optional<Image> productImage = Optional.empty();
    Builder() {
    }
    Builder(ProductImage source) {
      this.productImage = source.productImage();
    }
    @Override
    public ProductImage.Builder productImage(Image productImage) {
      this.productImage = Optional.of(productImage);
      return this;
    }
    @Override
    ProductImage.Builder productImage(Optional<Image> productImage) {
      if (productImage == null) {
        throw new NullPointerException("Null productImage");
      }
      this.productImage = productImage;
      return this;
    }
    @Override
    public ProductImage build() {
      return new AutoValue_ProductImage(
          this.productImage);
    }
  }

}
