package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_TokensInfo extends TokensInfo {

  private final Optional<String> role;

  private final Optional<List<Long>> tokenIds;

  private final Optional<List<byte[]>> tokens;

  private AutoValue_TokensInfo(
      Optional<String> role,
      Optional<List<Long>> tokenIds,
      Optional<List<byte[]>> tokens) {
    this.role = role;
    this.tokenIds = tokenIds;
    this.tokens = tokens;
  }

  @JsonProperty("role")
  @Override
  public Optional<String> role() {
    return role;
  }

  @JsonProperty("tokenIds")
  @Override
  public Optional<List<Long>> tokenIds() {
    return tokenIds;
  }

  @JsonProperty("tokens")
  @Override
  public Optional<List<byte[]>> tokens() {
    return tokens;
  }

  @Override
  public String toString() {
    return "TokensInfo{"
        + "role=" + role + ", "
        + "tokenIds=" + tokenIds + ", "
        + "tokens=" + tokens
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof TokensInfo) {
      TokensInfo that = (TokensInfo) o;
      return this.role.equals(that.role())
          && this.tokenIds.equals(that.tokenIds())
          && this.tokens.equals(that.tokens());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= role.hashCode();
    h$ *= 1000003;
    h$ ^= tokenIds.hashCode();
    h$ *= 1000003;
    h$ ^= tokens.hashCode();
    return h$;
  }

  @Override
  public TokensInfo.Builder toBuilder() {
    return new AutoValue_TokensInfo.Builder(this);
  }

  static final class Builder extends TokensInfo.Builder {
    private Optional<String> role = Optional.empty();
    private Optional<List<Long>> tokenIds = Optional.empty();
    private Optional<List<byte[]>> tokens = Optional.empty();
    Builder() {
    }
    Builder(TokensInfo source) {
      this.role = source.role();
      this.tokenIds = source.tokenIds();
      this.tokens = source.tokens();
    }
    @Override
    public TokensInfo.Builder role(String role) {
      this.role = Optional.of(role);
      return this;
    }
    @Override
    TokensInfo.Builder role(Optional<String> role) {
      if (role == null) {
        throw new NullPointerException("Null role");
      }
      this.role = role;
      return this;
    }
    @Override
    public TokensInfo.Builder tokenIds(List<Long> tokenIds) {
      this.tokenIds = Optional.of(tokenIds);
      return this;
    }
    @Override
    TokensInfo.Builder tokenIds(Optional<List<Long>> tokenIds) {
      if (tokenIds == null) {
        throw new NullPointerException("Null tokenIds");
      }
      this.tokenIds = tokenIds;
      return this;
    }
    @Override
    public TokensInfo.Builder tokens(List<byte[]> tokens) {
      this.tokens = Optional.of(tokens);
      return this;
    }
    @Override
    TokensInfo.Builder tokens(Optional<List<byte[]>> tokens) {
      if (tokens == null) {
        throw new NullPointerException("Null tokens");
      }
      this.tokens = tokens;
      return this;
    }
    @Override
    public TokensInfo build() {
      return new AutoValue_TokensInfo(
          this.role,
          this.tokenIds,
          this.tokens);
    }
  }

}
