class CreateOrders < ActiveRecord::Migration[6.1]
  def change
    create_table :orders do |t|
      t.integer :customer_id
      t.string :postal_code
      t.string :address
      t.string :name
      t.integer :shipping_cost
      t.integer :total_payment, default: "0"
      t.integer :payment_method, default: "0"
      t.integer :status

      t.timestamps
    end
  end
end
