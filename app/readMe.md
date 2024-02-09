
        TextView question = findViewById(R.id.question);
        
        Button btn1 = findViewById(R.id.opt1);
        Button btn2 = findViewById(R.id.opt2);
        Button btn3 = findViewById(R.id.opt3);
        Button btn4 = findViewById(R.id.opt4);

        question.setText(questionArray[index]);
        
        btn1.setText(btn1_text[index]);
        btn2.setText(btn2_text[index]);
        btn3.setText(btn3_text[index]);
        btn4.setText(btn4_text[index]);
        
        