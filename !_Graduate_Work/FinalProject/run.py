from app import create_app

# Run the app
if __name__ == '__main__':
    app = create_app()
    app.run(debug=True, host="localhost", port=3300)
