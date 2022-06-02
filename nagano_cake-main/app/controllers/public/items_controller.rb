class Public::ItemsController < ApplicationController
  def index
    @genres = Genre.all
    @items = Item.where(is_active: 1).page(params[:page]).per(8)
  end

  def show
    @genres = Genre.all
    @cart_item = CartItem.new
    @item = Item.find(params[:id])
  end

  def search
    @genres = Genre.all
    @genre = Genre.find(params[:item_id])
    @items = Item.where(genre_id: params[:item_id]).where(is_active: 1).page(params[:page]).per(8)
  end

end
