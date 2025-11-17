package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_GroundingChunkMapsPlaceAnswerSourcesReviewSnippet extends GroundingChunkMapsPlaceAnswerSourcesReviewSnippet {

  private final Optional<GroundingChunkMapsPlaceAnswerSourcesAuthorAttribution> authorAttribution;

  private final Optional<String> flagContentUri;

  private final Optional<String> googleMapsUri;

  private final Optional<String> relativePublishTimeDescription;

  private final Optional<String> review;

  private final Optional<String> reviewId;

  private final Optional<String> title;

  private AutoValue_GroundingChunkMapsPlaceAnswerSourcesReviewSnippet(
      Optional<GroundingChunkMapsPlaceAnswerSourcesAuthorAttribution> authorAttribution,
      Optional<String> flagContentUri,
      Optional<String> googleMapsUri,
      Optional<String> relativePublishTimeDescription,
      Optional<String> review,
      Optional<String> reviewId,
      Optional<String> title) {
    this.authorAttribution = authorAttribution;
    this.flagContentUri = flagContentUri;
    this.googleMapsUri = googleMapsUri;
    this.relativePublishTimeDescription = relativePublishTimeDescription;
    this.review = review;
    this.reviewId = reviewId;
    this.title = title;
  }

  @JsonProperty("authorAttribution")
  @Override
  public Optional<GroundingChunkMapsPlaceAnswerSourcesAuthorAttribution> authorAttribution() {
    return authorAttribution;
  }

  @JsonProperty("flagContentUri")
  @Override
  public Optional<String> flagContentUri() {
    return flagContentUri;
  }

  @JsonProperty("googleMapsUri")
  @Override
  public Optional<String> googleMapsUri() {
    return googleMapsUri;
  }

  @JsonProperty("relativePublishTimeDescription")
  @Override
  public Optional<String> relativePublishTimeDescription() {
    return relativePublishTimeDescription;
  }

  @JsonProperty("review")
  @Override
  public Optional<String> review() {
    return review;
  }

  @JsonProperty("reviewId")
  @Override
  public Optional<String> reviewId() {
    return reviewId;
  }

  @JsonProperty("title")
  @Override
  public Optional<String> title() {
    return title;
  }

  @Override
  public String toString() {
    return "GroundingChunkMapsPlaceAnswerSourcesReviewSnippet{"
        + "authorAttribution=" + authorAttribution + ", "
        + "flagContentUri=" + flagContentUri + ", "
        + "googleMapsUri=" + googleMapsUri + ", "
        + "relativePublishTimeDescription=" + relativePublishTimeDescription + ", "
        + "review=" + review + ", "
        + "reviewId=" + reviewId + ", "
        + "title=" + title
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof GroundingChunkMapsPlaceAnswerSourcesReviewSnippet) {
      GroundingChunkMapsPlaceAnswerSourcesReviewSnippet that = (GroundingChunkMapsPlaceAnswerSourcesReviewSnippet) o;
      return this.authorAttribution.equals(that.authorAttribution())
          && this.flagContentUri.equals(that.flagContentUri())
          && this.googleMapsUri.equals(that.googleMapsUri())
          && this.relativePublishTimeDescription.equals(that.relativePublishTimeDescription())
          && this.review.equals(that.review())
          && this.reviewId.equals(that.reviewId())
          && this.title.equals(that.title());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= authorAttribution.hashCode();
    h$ *= 1000003;
    h$ ^= flagContentUri.hashCode();
    h$ *= 1000003;
    h$ ^= googleMapsUri.hashCode();
    h$ *= 1000003;
    h$ ^= relativePublishTimeDescription.hashCode();
    h$ *= 1000003;
    h$ ^= review.hashCode();
    h$ *= 1000003;
    h$ ^= reviewId.hashCode();
    h$ *= 1000003;
    h$ ^= title.hashCode();
    return h$;
  }

  @Override
  public GroundingChunkMapsPlaceAnswerSourcesReviewSnippet.Builder toBuilder() {
    return new AutoValue_GroundingChunkMapsPlaceAnswerSourcesReviewSnippet.Builder(this);
  }

  static final class Builder extends GroundingChunkMapsPlaceAnswerSourcesReviewSnippet.Builder {
    private Optional<GroundingChunkMapsPlaceAnswerSourcesAuthorAttribution> authorAttribution = Optional.empty();
    private Optional<String> flagContentUri = Optional.empty();
    private Optional<String> googleMapsUri = Optional.empty();
    private Optional<String> relativePublishTimeDescription = Optional.empty();
    private Optional<String> review = Optional.empty();
    private Optional<String> reviewId = Optional.empty();
    private Optional<String> title = Optional.empty();
    Builder() {
    }
    Builder(GroundingChunkMapsPlaceAnswerSourcesReviewSnippet source) {
      this.authorAttribution = source.authorAttribution();
      this.flagContentUri = source.flagContentUri();
      this.googleMapsUri = source.googleMapsUri();
      this.relativePublishTimeDescription = source.relativePublishTimeDescription();
      this.review = source.review();
      this.reviewId = source.reviewId();
      this.title = source.title();
    }
    @Override
    public GroundingChunkMapsPlaceAnswerSourcesReviewSnippet.Builder authorAttribution(GroundingChunkMapsPlaceAnswerSourcesAuthorAttribution authorAttribution) {
      this.authorAttribution = Optional.of(authorAttribution);
      return this;
    }
    @Override
    GroundingChunkMapsPlaceAnswerSourcesReviewSnippet.Builder authorAttribution(Optional<GroundingChunkMapsPlaceAnswerSourcesAuthorAttribution> authorAttribution) {
      if (authorAttribution == null) {
        throw new NullPointerException("Null authorAttribution");
      }
      this.authorAttribution = authorAttribution;
      return this;
    }
    @Override
    public GroundingChunkMapsPlaceAnswerSourcesReviewSnippet.Builder flagContentUri(String flagContentUri) {
      this.flagContentUri = Optional.of(flagContentUri);
      return this;
    }
    @Override
    GroundingChunkMapsPlaceAnswerSourcesReviewSnippet.Builder flagContentUri(Optional<String> flagContentUri) {
      if (flagContentUri == null) {
        throw new NullPointerException("Null flagContentUri");
      }
      this.flagContentUri = flagContentUri;
      return this;
    }
    @Override
    public GroundingChunkMapsPlaceAnswerSourcesReviewSnippet.Builder googleMapsUri(String googleMapsUri) {
      this.googleMapsUri = Optional.of(googleMapsUri);
      return this;
    }
    @Override
    GroundingChunkMapsPlaceAnswerSourcesReviewSnippet.Builder googleMapsUri(Optional<String> googleMapsUri) {
      if (googleMapsUri == null) {
        throw new NullPointerException("Null googleMapsUri");
      }
      this.googleMapsUri = googleMapsUri;
      return this;
    }
    @Override
    public GroundingChunkMapsPlaceAnswerSourcesReviewSnippet.Builder relativePublishTimeDescription(String relativePublishTimeDescription) {
      this.relativePublishTimeDescription = Optional.of(relativePublishTimeDescription);
      return this;
    }
    @Override
    GroundingChunkMapsPlaceAnswerSourcesReviewSnippet.Builder relativePublishTimeDescription(Optional<String> relativePublishTimeDescription) {
      if (relativePublishTimeDescription == null) {
        throw new NullPointerException("Null relativePublishTimeDescription");
      }
      this.relativePublishTimeDescription = relativePublishTimeDescription;
      return this;
    }
    @Override
    public GroundingChunkMapsPlaceAnswerSourcesReviewSnippet.Builder review(String review) {
      this.review = Optional.of(review);
      return this;
    }
    @Override
    GroundingChunkMapsPlaceAnswerSourcesReviewSnippet.Builder review(Optional<String> review) {
      if (review == null) {
        throw new NullPointerException("Null review");
      }
      this.review = review;
      return this;
    }
    @Override
    public GroundingChunkMapsPlaceAnswerSourcesReviewSnippet.Builder reviewId(String reviewId) {
      this.reviewId = Optional.of(reviewId);
      return this;
    }
    @Override
    GroundingChunkMapsPlaceAnswerSourcesReviewSnippet.Builder reviewId(Optional<String> reviewId) {
      if (reviewId == null) {
        throw new NullPointerException("Null reviewId");
      }
      this.reviewId = reviewId;
      return this;
    }
    @Override
    public GroundingChunkMapsPlaceAnswerSourcesReviewSnippet.Builder title(String title) {
      this.title = Optional.of(title);
      return this;
    }
    @Override
    GroundingChunkMapsPlaceAnswerSourcesReviewSnippet.Builder title(Optional<String> title) {
      if (title == null) {
        throw new NullPointerException("Null title");
      }
      this.title = title;
      return this;
    }
    @Override
    public GroundingChunkMapsPlaceAnswerSourcesReviewSnippet build() {
      return new AutoValue_GroundingChunkMapsPlaceAnswerSourcesReviewSnippet(
          this.authorAttribution,
          this.flagContentUri,
          this.googleMapsUri,
          this.relativePublishTimeDescription,
          this.review,
          this.reviewId,
          this.title);
    }
  }

}
