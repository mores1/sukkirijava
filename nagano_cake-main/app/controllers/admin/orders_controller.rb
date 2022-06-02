class Admin::OrdersController < ApplicationController
  before_action :authenticate_admin!

  def show
    @order = Order.find(params[:id])
    @customer = @order.customer
    @order_details = @order.order_details.all

  end

  def update
    @order = Order.find(params[:id])
    @order.update(order_params)
    if @order.status_before_type_cast == 1
      @order.order_details.update_all(making_status: 1)
    end
    redirect_to admin_order_path(@order)
  end

  private
  def order_params
    params.require(:order).permit(:status)
  end

end
