package domain;

public interface Code {
	public static final int SHOP_LOGIN = 999; //�α���
	public static final int SHOP_LOGOUT = 998; //�α׾ƿ�
	
	public static final int HOST_MENU = 100; // 100 ����
	public static final int HOST_STOCK_MENU = 110;//�������
	public static final int HOST_BOOK_LIST = 111; //å���
	public static final int HOST_BOOK_ADD = 112; //å �߰�
	public static final int HOST_BOOK_UPDATE = 113; //å ����
	public static final int HOST_BOOK_DEL = 114; //å ����
	public static final int HOST_ORDER_MENU=120; //////�ֹ�����
	public static final int HOST_ORDER_LIST = 121;  //�ֹ���� 121
	public static final int HOST_ORDER_CONFIRM = 122;//��������
	public static final int HOST_ORDER_CANCEL = 123;//�������
	public static final int HOST_SALE_TOTAL = 124; //���
	
	
	//�մ�
	public static final int GUEST_MENU = 200;
	public static final int GUEST_CART_MENU=210;  //////��ٱ���
	
	public static final int GUEST_CART_LIST = 211; //��ٱ��� ����Ʈ
	public static final int GUEST_CART_ADD = 212; //////��ٱ��� ���
	public static final int GUEST_CART_DEL = 213; //��ٱ��� ����
	public static final int GUEST_CART_BUY = 214; //����
	
	public static final int GUEST_NOW_BUY = 220; //�ٷα���
	public static final int GUEST_ORDER_LIST = 221; //�ٷα��� ���
	
	public static final int GUEST_REFUND = 230; //ȯ��
	
	
}