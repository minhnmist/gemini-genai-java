package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_LatLng extends LatLng {

  private final Optional<Double> latitude;

  private final Optional<Double> longitude;

  private AutoValue_LatLng(
      Optional<Double> latitude,
      Optional<Double> longitude) {
    this.latitude = latitude;
    this.longitude = longitude;
  }

  @JsonProperty("latitude")
  @Override
  public Optional<Double> latitude() {
    return latitude;
  }

  @JsonProperty("longitude")
  @Override
  public Optional<Double> longitude() {
    return longitude;
  }

  @Override
  public String toString() {
    return "LatLng{"
        + "latitude=" + latitude + ", "
        + "longitude=" + longitude
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof LatLng) {
      LatLng that = (LatLng) o;
      return this.latitude.equals(that.latitude())
          && this.longitude.equals(that.longitude());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= latitude.hashCode();
    h$ *= 1000003;
    h$ ^= longitude.hashCode();
    return h$;
  }

  @Override
  public LatLng.Builder toBuilder() {
    return new AutoValue_LatLng.Builder(this);
  }

  static final class Builder extends LatLng.Builder {
    private Optional<Double> latitude = Optional.empty();
    private Optional<Double> longitude = Optional.empty();
    Builder() {
    }
    Builder(LatLng source) {
      this.latitude = source.latitude();
      this.longitude = source.longitude();
    }
    @Override
    public LatLng.Builder latitude(Double latitude) {
      this.latitude = Optional.of(latitude);
      return this;
    }
    @Override
    LatLng.Builder latitude(Optional<Double> latitude) {
      if (latitude == null) {
        throw new NullPointerException("Null latitude");
      }
      this.latitude = latitude;
      return this;
    }
    @Override
    public LatLng.Builder longitude(Double longitude) {
      this.longitude = Optional.of(longitude);
      return this;
    }
    @Override
    LatLng.Builder longitude(Optional<Double> longitude) {
      if (longitude == null) {
        throw new NullPointerException("Null longitude");
      }
      this.longitude = longitude;
      return this;
    }
    @Override
    public LatLng build() {
      return new AutoValue_LatLng(
          this.latitude,
          this.longitude);
    }
  }

}
