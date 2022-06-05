Rails.application.routes.draw do

  scope module: :public do

    root :to => "homes#top"
    get 'about' => 'homes#about'

    resource :customers, only: [:edit, :update] do
      get 'my_page' => 'customers#show'
      get 'unsubscribe' => 'customers#unsubscribe'
      patch 'withdraw' => 'customers#withdraw'
    end

    devise_for :customers,skip: [:passwords], controllers: {
      registrations: "public/registrations",
      sessions: 'public/sessions'
    }

    resources :addresses, only: [:index, :edit, :create, :update, :destroy]

    resources :items, only: [:index, :show] do
      get 'search' => "items#search"
    end

    resources :cart_items, only: [:index, :update, :destroy, :create] do
      collection do
        delete 'destroy_all'
      end
    end

    resources :orders, only: [:new, :create, :index, :show] do
      post 'confirm' => 'orders#confirm'
      collection do
        get 'complete'
      end
    end

  end

  devise_for :admin, skip: [:registrations, :passwords] ,controllers: {
  sessions: "admin/sessions"
  }

  namespace :admin do
    root :to => "homes#top"
    resources :items, only: [:index, :new, :create, :show, :edit, :update]
    resources :genres, only: [:index, :create, :edit, :update]
    resources :customers, only: [:index, :show, :edit, :update]
    resources :orders, only: [:show, :update]
    resources :order_details, only: [:update]
  end

end
