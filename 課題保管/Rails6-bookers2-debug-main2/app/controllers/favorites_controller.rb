class FavoritesController < ApplicationController
  before_action :authenticate_user!

  # def create
  #   book = Book.find(params[:book_id])
  #   favorite = current_user.favorites.new(book_id: book.id)
  #   favorite.save
  #   # render 'replace_btn'
  # end

  # def destroy
  #   book = Book.find(params[:book_id])
  #   favorite = current_user.favorites.find_by(book_id: book.id)
  #   favorite.destroy
  #   # render 'replace_btn'
  # end
  
  
  
    def create
    @book = Book.find(params[:book_id])
    favorite = @book.favorites.new(user_id: current_user.id)
    favorite.save
    # app/views/favorites/create.js.erbを参照する
    end

    def destroy
    @book = Book.find(params[:book_id])
    favorite = @book.favorites.find_by(user_id: current_user.id)
    favorite.destroy
    # app/views/favorites/destroy.js.erbを参照する
    end

end
