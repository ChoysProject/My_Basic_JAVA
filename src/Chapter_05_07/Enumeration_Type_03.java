package Chapter_05_07;

import java.util.Calendar;

import javax.print.CancelablePrintJob;

public class Enumeration_Type_03 {

	public static void main(String[] args) {
		
		
		// ���� Ÿ�� ����

		// ���� Ÿ���� �����ߴٸ� ���� ���� Ÿ���� ����� ��  �ִ�.
		// ���� Ÿ�Ե� �ϳ��� ������ Ÿ���̹Ƿ� ������ �����ϰ� ����ؾ��Ѵ�.
		// ������ ���� Ÿ�� ������ �����ϴ� ����̴�.
		
		// ����Ÿ�� ����;
		
		// ���� ��� ���� Ÿ�� Week�� ������ �����ϸ� ������ ����.
		
		// Week today;
		// Week reservationDay;
		
		// ���� Ÿ�� ������ �����ߴٸ� ������ ���� ���� ����� ������ �� �ִ�.
		// ���� ����� �ܵ����� ����� ���� ���� �ݵ�� ����Ÿ��. ���Ż���� ���ȴ�.
		
		// ����Ÿ�� ���� = ����Ÿ��.���Ż��;
		
		// ���� ��� today ���� ������ ���� ����� SUNDAY�� �����ϸ� ������ ����.
		
		// Week today = Week.SUNDAY;
		
		// ���� Ÿ�� ������ NULL ���� ������ �� �ִµ� ���� Ÿ�Ե� ���� Ÿ���̱� �����̴�.
		
		// Week birthday = null;
		
		// ����Ÿ�� ������ ��ü�� �����ϴ� ������� �˰��ִµ�, �׷��ٸ� ���� ����� ��ü�ϱ�? �׷���.
		// ���� ����� ���� ��ü�� �����ȴ�. ���� Ÿ�� Week�� ��� MONDAY���� SUNDAY������ ���Ż���� ������ ���� �� 7���� Week ��ü�� �����ȴ�.
		// �׸��� �޼��� ������ �����Ȥ� ���� ����� �ش� Week�� ���� �����ϰ� �ȴ�.
		
		// �׷��ٸ� �� �ڵ带 ��� �����ϸ� ������ ?
		
		// Week today = Week.SUNDAY;
		
		// ���� Ÿ�� ���� today�� ���� ������ �����ȴ�. today�� ����ȴ� ���� Week.SUNDAY ���� ����� �����ϴ� ��ü�� �����̴�.
		// ���� ���� ��� Week.SUNDAY�� today ������ ���� ���� Week ��ü�� �����ϰ� �ȴ�.
		
		// �׷��� ������ today������ Week.SUNDAY����� == ������ ����� true�� �ȴ�.
		
		// today == Week.SUNDAY // true
		
		// �׷��ٸ� ���� �������� ���� �ڵ忡�� ���� week1�� week2�� == ������ ����� �� true�� �������� ������ �� ���� ���̴�.
		// week1�� week2 ��� Week.SATURDAY ����� ���� ������ Week ��ü�� �����ϱ� �����̴�.
		
		// Week week1 = Week.SATURDAY;
		// Week week2 = Week.SATURDAY;
		// week1 == week2 // true;
		
		// �ڹٴ� ��ǻ���� ��¥ �� ����, �ð� ���α׷����� ����� �� �ֵ��� �ϱ� ���� Date. Calendar, LocalDateTime ���� Ŭ������ �����Ѵ�. LocalDateTime�� �ڹ� 8���� �����ϴ� API�̴�.
		// ���� �������� ȣȯ���� ���� Calendar�� �̿��ؼ� ��¥�� �ð��� ��� ����� �˾ƺ���.
		
		// �켱 Calendar ������ �����ϰ� Calendar.getInstance() �޼��尡 �����ϴ� Calendar ��ü�� ��´�.
		
		// Calendar now = Calendar.getInstance() �޼ҵ尡 �����ϴ� Calendar ��ü�� ��´�.
		
		Calendar now = Calendar.getInstance();
		
		// Calendar ��ü�� ����ٸ� get() �޼��带 �̿��ؼ� ��, ��, �� ����, �ð�, ��, �ʸ� ������ ���� ���� �� �ִ�.
		
		int year = now.get(Calendar.YEAR);	//��
		int month = now.get(Calendar.MONTH +1);	//��(1~12)
		int day = now.get(Calendar.DAY_OF_MONTH); // ��
		int week = now.get(Calendar.DAY_OF_WEEK); // ����(1~7)
		int hour = now.get(Calendar.HOUR); // ��
		int minute = now.get(Calendar.MINUTE); // ��
		int second = now.get(Calendar.SECOND); // ��
		
		// �׷� Calendar�� �̿��ؼ� ������ ������ ��� ���� ���� Ÿ�� ���� today�� �ش� ���� ����� �����ϴ� ������ ���캸��.
		// Calendar�� ����ϱ� ���ؼ��� 1������ imprt���� �ʿ��ϴ�.
		// import���� 6�忡�� ����ȴ�.
		// 7���ο� Calendar�� ��� 8���ο��� ���Ϻ� ���ڸ� ��´�.
		// 10~25������ switch���� �̿��ؼ� ���� Ÿ�� ���� today�� ���� ����� ��������.
		// 29~33������ if���� �̿��ؼ� �Ͽ������� Ȯ���ϰ� ����� ������ �����Ѵ�.
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
