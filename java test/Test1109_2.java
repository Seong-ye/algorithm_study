package ex_jtextarea;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Test1109_2 {

	public Test1109_2(){
		showFrame();
	}
	public void showFrame() {
		JFrame f = new JFrame("채팅 클라이언트");
		f.setSize(400,300);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//중앙 영역에 채팅 메세지 출력
		//채팅 메세지 스크롤을 위해 JScrollPane 생성 후 JTextArea 부착
	
		
		JScrollPane scrollPane = new JScrollPane();
		f.add(scrollPane, BorderLayout.CENTER);
		
		JTextArea ta = new JTextArea(); // 부착레이아웃 BorderLayout
		ta.setEditable(false); //편집 불가능하도록 설정
		
		scrollPane.setViewportView(ta);
		
		//하단영억에 채팅 메세지 입력 및 버튼
		//JTextField, JButton을 하나로 묶기 위해 JPanel 생성 후 부착
		
		JPanel pSouth = new JPanel();
		f.add(pSouth, BorderLayout.SOUTH);
		
		JTextField tf = new JTextField(20); //부착 레이아웃 FlowLayout
		pSouth.add(tf);
		
		JButton btnSubmit = new JButton("전송");
		JButton btnClear = new JButton("초기화");
		pSouth.add(btnSubmit);
		pSouth.add(btnClear);
		
		//전송 버튼 클릭 및 텍스트 필드 입력 후 엔터 키 입력 시 메세지전송(JTextArea 출력)

		btnSubmit.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				//입력 메세지 가져오기
				String str = tf.getText();
				
				//JTextArea 기존 내용 뒤에 출력
				ta.setText(ta.getText()+"\n"+str);
				//JTextField 입력 내용 초기화
				tf.setText("");
				//JTextField 커서 요청
				tf.requestFocus();
			}
			
		});
		
		
		btnClear.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ta.setText("");
				
			}
			
		});
		f.setVisible(true);
		
		//모든 요소 화면에 표시 후 JTextField에 커서 요청
		tf.requestFocus();
		
	}
	
	public static void main(String[] args) {
		
		new Test1109_2();
	}

}
