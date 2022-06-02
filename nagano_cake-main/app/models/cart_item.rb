class CartItem < ApplicationRecord
  belongs_to :customer
  belongs_to :item


  def subtotal
    item.with_tax_price * amount
  end

  def total_item_price
    total_item_price = 0
    self.each do |cart_item|
      sum = cart_item.subtotal
      total_item_price += sum
    end
    return total_item_price
  end

end
