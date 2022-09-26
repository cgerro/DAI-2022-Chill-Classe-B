package ch.heigvd.dai.chill.domain.cgerro;

import ch.heigvd.dai.chill.domain.IProduct;

import java.math.BigDecimal;

public class Chouffe implements IProduct {

  public final static String NAME = "Chouffe";
  public final static BigDecimal PRICE = new BigDecimal(4.5);

  @Override
  public String getName() {
    return NAME;
  }

  @Override
  public BigDecimal getPrice() {
    return PRICE;
  }
}
