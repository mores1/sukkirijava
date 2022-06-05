class OrderDetail < ApplicationRecord
  belongs_to :order
  belongs_to :item

  enum making_status: { impossible: 0, waiting: 1, making: 2, finished: 3 }
  
  def total_item_price
    price*amount
  end
  
  
  
end
