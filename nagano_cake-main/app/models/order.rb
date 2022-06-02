class Order < ApplicationRecord
  belongs_to :customer
  has_many :order_details, dependent: :destroy

  enum payment_method: { credit_card: 0, transfer: 1 }
  enum status: { waiting: 0, confirm: 1, making: 2, preparing: 3, shipped: 4}

  def total_product_price
    total_product_price = 0
    self.order_details.each do |order_detail|
      sum = order_detail.price * order_detail.amount
      total_product_price += sum
    end
    return total_product_price
  end

end
